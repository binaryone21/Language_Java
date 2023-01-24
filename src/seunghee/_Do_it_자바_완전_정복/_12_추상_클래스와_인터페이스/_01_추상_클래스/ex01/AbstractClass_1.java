package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._01_추상_클래스.ex01;

abstract class A {
    abstract void abc();
}

class B extends A {
    void abc() {
        System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class AbstractClass_1 {
    public static void main(String[] args) {
        // 객체 생성
        A b1 = new B();
        A b2 = new B();

        // 메서드 호출
        b1.abc();
        b2.abc();
    }
}
