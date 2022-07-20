package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._03_메서드_오버라이딩;

class _03_A {
    void print1() {
        System.out.println("A 클래스 print1");
    }
    void print2() {
        System.out.println("A 클래스 print2");
    }
}

class _03_B extends _03_A {
    @Override
    void print1() {
        System.out.println("B 클래스 print1");
    }
    void print2(int a) {
        System.out.println("B 클래스 print2");
    }
}

public class _03_MethodOverriding_3 {
    public static void main(String[] args) {
        // A 타입 선언 / A 생성자 사용
        _03_A aa = new _03_A();
        aa.print1();
        aa.print2();
        System.out.println();

        // B 타입 선언 / B 생성자 사용
        _03_B bb = new _03_B();
        bb.print1();
        bb.print2();
        bb.print2(3);
        System.out.println();

        // A 타입 선언 / B 생성자 사용
        _03_A ab = new _03_B();
        ab.print1();
        ab.print2();
    }
}
