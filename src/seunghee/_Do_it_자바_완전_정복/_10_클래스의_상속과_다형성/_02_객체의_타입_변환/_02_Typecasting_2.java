package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._02_객체의_타입_변환;

class _02_A {
    int m = 3;
    void abc() {
        System.out.println("A 클래스");
    }
}

class _02_B extends _02_A {
    int n = 4;
    void bcd() {
        System.out.println("B 클래스");
    }
}

public class _02_Typecasting_2 {
    public static void main(String[] args) {
        // A 타입 / A 생성자
        _02_A aa = new _02_A();
        System.out.println(aa.m);
        aa.abc();

        // B 타입 / B 생성자
        _02_B bb = new _02_B();
        System.out.println(bb.m);
        System.out.println(bb.n);
        bb.abc();
        bb.bcd();

        // A 타입 / B 생성자 : 다형적 표현
        _02_A ab = new _02_B();
        System.out.println(ab.m);
        ab.abc();
    }
}
