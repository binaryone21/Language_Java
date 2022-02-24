package seunghee.example._01_academy_basic;

public class Academy {
    public static void main(String[] args) {
        String name = "유재석";
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 0;
        double avg = 0.0;
        char grd = ' ';

        sum = (kor + eng + mat);
        avg = sum/3.0;
        grd = (avg >= 90) ? '수' :
                (avg >= 80) ? '우' :
                        (avg >= 70) ? '미' :
                                (avg >= 60) ? '양' : '가';

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("------------");
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", avg);
        System.out.println("학점 : " + grd);
    }
}