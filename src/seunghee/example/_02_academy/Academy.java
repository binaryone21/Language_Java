package seunghee.example._02_academy;

import java.util.Scanner;

public class Academy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력해 주세요 : ");
        String name = sc.nextLine();
        System.out.print("국어 점수를 입력해 주세요 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어 점수를 입력해 주세요 : ");
        int eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학 점수를 입력해 주세요 : ");
        int mat = Integer.parseInt(sc.nextLine());

        int sum = (kor + eng + mat);
        double avg = sum/3.0;
        avg = Math.floor(avg*10)/10.0;
        char grd = ' ';

        switch((int)avg/10) {
            case 10 :
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default : grd = '가'; break;
        }

        String fmt = ("\n이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n" +
                "----------\n총점 : %d\n평균 : %.2f\n학점 : %c");
        String result = String.format(fmt, name, kor, eng, mat, sum, avg, grd);
        System.out.println(result);
    }
}
