package seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._01_패키지와_임포트.ex02;

import seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._01_패키지와_임포트.sample.A;

public class PackageImport_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
