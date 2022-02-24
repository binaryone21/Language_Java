package seunghee.example._05_academy_class;

import java.util.Scanner;

public class AcademyService {

    AcademyVO setAcademyVO() {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("국어을 입력하세요 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어을 입력하세요 : ");
        int eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학을 입력하세요 : ");
        int mat = Integer.parseInt(sc.nextLine());
        System.out.println();

        // 클래스 단위의 리턴값
        return new AcademyVO(name, kor, eng, mat, 0, 0, ' ');
    }

    void computeAcademy(AcademyVO person) {
        person.setSum(person.getKor() + person.getEng() + person.getMat());
        person.setAvg(person.getSum() / 3.0);
        switch((int)person.getAvg()/10) {
            case 10 :
            case 9 : person.setGrd('수'); break;
            case 8 : person.setGrd('우'); break;
            case 7 : person.setGrd('미'); break;
            case 6 : person.setGrd('양'); break;
            default : person.setGrd('가'); break;
        }
    }
}
