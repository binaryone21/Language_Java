package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._03_메서드_오버라이딩;

class _01_A {
    void print() {
        System.out.println("A 클래스");
    }
}

class _01_B extends _01_A {
    @Override
    void print() {
        System.out.println("B 클래스");
    }
}

public class _01_MethodOverriding_1 {
    public static void main(String[] args) {
        // A 타입 / A 생성자
        _01_A aa = new _01_A();
        aa.print();

        // B 타입 / B 생성자
        _01_B bb = new _01_B();
        bb.print();

        // A 타입 / B 생성자
        _01_A ab = new _01_B();
        ab.print();
    }
}
