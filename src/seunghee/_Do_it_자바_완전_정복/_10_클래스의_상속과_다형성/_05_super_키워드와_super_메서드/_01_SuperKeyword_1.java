package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._05_super_키워드와_super_메서드;

class _01_A {
    void abc() {
        System.out.println("A 클래스의 abc()");
    }
}

class _01_B extends _01_A {
    void abc() {
        System.out.println("B 클래스의 abc()");
    }
    void bcd() {
        abc();      // this.abc();
    }
}

public class _01_SuperKeyword_1 {
    public static void main(String[] args) {
        // 객체 생성
        _01_B bb = new _01_B();

        // 메서드 호출
        bb.bcd();
    }
}
