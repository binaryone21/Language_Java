package seunghee.example._07_academy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AcademyService extends AcademyAbstract {

    // 멤버변수 선언
    ArrayList<AcademyVO> persons = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String fmtList = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n";
    String fmtView = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d, 총점 : %d, 평균 : %.1f, 학점 : %c\n";
    String path = "src/seunghee/example/academy.txt.txt";

    /* 학생정보 데이터 불러오기 */
    public void readAcademy() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            while(br.ready()) {
                String[] datas = br.readLine().split(", ");
                AcademyVO person = new AcademyVO(datas[0], Integer.parseInt(datas[1]),
                        Integer.parseInt(datas[2]), Integer.parseInt(datas[3]));
                computeAcademy(person);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* 학생정보 데이터 저장하기 */
    public void writeAcademy() {
        FileWriter fw = null;
        BufferedWriter bw = null;

        String fmt = "%s, %d, %d, %d";

        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            for(AcademyVO person : persons) {
                String data = String.format(fmt, person.getName(),
                        person.getKor(), person.getEng(), person.getMat());
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* 디스플레이 */
    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------\n")
                .append(" 1. 학생 성적 입력\n")
                .append(" 2. 학생 성적 조회\n")
                .append(" 3. 학생 성적 상제 조회\n")
                .append(" 4. 학생 성적 수정\n")
                .append(" 5. 학생 정보 삭제\n")
                .append(" 0. 프로그램 종료\n")
                .append("----------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    /* 학생정보 추가 */
    public void insertAcademy() {
        System.out.print("이름을 입력해 주세요 : ");
        String name = sc.nextLine();
        System.out.print("국어 점수를 입력해 주세요 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어 점수를 입력해 주세요 : ");
        int eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학 점수를 입력해 주세요 : ");
        int mat = Integer.parseInt(sc.nextLine());
        System.out.println();

        AcademyVO person = new AcademyVO(name, kor, eng, mat);
        computeAcademy(person);
        persons.add(person);
    }

    /* 학생정보 계산 */
    public void computeAcademy(AcademyVO person) {
        person.setSum(person.getKor() + person.getEng() + person.getMat());
        person.setAvg(person.getSum() / 3.0 );

        switch((int)person.getAvg() / 10) {
            case 10:
            case 9: person.setGrd ('수'); break;
            case 8: person.setGrd ('우'); break;
            case 7: person.setGrd ('미'); break;
            case 6: person.setGrd ('양'); break;
            default: person.setGrd ('가');
        }
    }

    /* 학생정보 전체 */
    public void voListAcademy() {
        Iterator<AcademyVO> iter = persons.iterator();

        while(iter.hasNext()) {
            AcademyVO person = iter.next();
            System.out.printf(fmtList, person.getName(), person.getKor(), person.getEng(), person.getMat());
        }
    }

    /* 학생정보 상세 */
    public void selectAcademy() {
        System.out.print("상세 조회할 학생이름을 입력해 주세요 : ");
        String target = sc.nextLine();

        // 이터레이터를 이용 한 방법
        Iterator<AcademyVO> iter = persons.iterator();
        while (iter.hasNext()) {
            AcademyVO person = iter.next();
            if(person.getName().equals(target)) {
                printPerson(person);
            }
        }

        // 포이치문을 이용한 방법
        for(AcademyVO person : persons) {
            if(person.getName().equals(target)) {
                printPerson(person);
            }
        }
    }

    /* 학생정보 출력 */
    public void printPerson(AcademyVO person) {
        System.out.printf(fmtView, person.getName(), person.getKor(), person.getEng(),
                person.getMat(), person.getSum(), person.getAvg(), person.getGrd());
    }

    /* 학생정보 수정 */
    public void updateAcademy() {
        System.out.print("수정할 학생이름을 입력해 주세요 : ");
        String target = sc.nextLine();
        int index = 0;

        for(AcademyVO person : persons) {
            if(person.getName().equals(target)) {
                printPerson(person);
                index = persons.indexOf(person);

                System.out.println("해당 학생 정보를 수정하시겠습니까? (Y/N)");
                String isOk = sc.nextLine();
                if(isOk.equals("Y")) {
                    System.out.print("국어 점수를 입력해 주세요 : ");
                    person.setKor(Integer.parseInt(sc.nextLine()));
                    System.out.print("영어 점수를 입력해 주세요 : ");
                    person.setEng(Integer.parseInt(sc.nextLine()));
                    System.out.print("수학 점수를 입력해 주세요 : ");
                    person.setMat(Integer.parseInt(sc.nextLine()));
                    System.out.println();
                    computeAcademy(person);
                    System.out.println("수정완료 되었습니다.");
                } else {
                    System.out.println("수정이 취소되었습니다.");
                }
                break;
            }
        }

    }

    /* 학생정보 삭제 */
    public void deleteAcademy() {
        System.out.print("삭제할 학생이름을 입력해 주세요 : ");
        String target = sc.nextLine();
        int index = 0;

        for(AcademyVO person : persons) {
            if(person.getName().equals(target)) {
                printPerson(person);
                index = persons.indexOf(person);

                System.out.println("해당 학생 정보를 삭제하시겠습니까? (Y/N)");
                String isOk = sc.nextLine();
                if(isOk.equals("Y")) {
                    persons.remove(person);
                    System.out.println("삭제완료 되었습니다.");
                } else {
                    System.out.println("삭제가 취소되었습니다.");
                }
                break;
            }
        }
    }
}
