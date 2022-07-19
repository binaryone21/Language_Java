package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._02_static_제어자;

class _01_A {
    int m = 3;          // 인스턴스 필드
    static int n = 5;   // 정적 필드
}

public class _01_StaticField_1 {
    public static void main(String[] args) {
        //  인스턴스 필드 활용 방법(객체를 생성한 후 사용 가능)
        _01_A a1 = new _01_A();
        System.out.println(a1.m);

        // 정적 필드 활용 방법
        // 1. 객체 생성 없이 클래스명으로 바로 활용
        System.out.println(_01_A.n);
        _01_A a2 = new _01_A();
        System.out.println(a2.n);
    }
}
