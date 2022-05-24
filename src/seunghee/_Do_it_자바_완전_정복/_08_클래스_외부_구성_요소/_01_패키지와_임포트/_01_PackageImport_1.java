package seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._01_패키지와_임포트;

public class _01_PackageImport_1 {
    public static void main(String[] args) {
        // 객체 생성
        // A a = new A();
        seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._01_패키지와_임포트.sample.A a = new seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._01_패키지와_임포트.sample.A();

        // 멤버 활용
        System.out.println(a.m);
        System.out.println(a.n);
        a.print();
    }
}
