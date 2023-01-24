package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._05_super_키워드와_super_메서드.ex01;

class A {
    void abc() {
        System.out.println("A 클래스의 abc()");
    }
}

class B extends A {
    void abc() {
        System.out.println("B 클래스의 abc()");
    }
    void bcd() {
        abc();      // this.abc();
    }
}

public class SuperKeyword_1 {
    public static void main(String[] args) {
        // 객체 생성
        B bb = new B();

        // 메서드 호출
        bb.bcd();
    }
}
