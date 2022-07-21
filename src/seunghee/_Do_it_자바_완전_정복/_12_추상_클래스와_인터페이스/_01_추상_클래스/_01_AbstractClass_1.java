package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._01_추상_클래스;

abstract class _01_A {
    abstract void abc();
}

class _01_B extends _01_A {
    void abc() {
        System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
    }
}

public class _01_AbstractClass_1 {
    public static void main(String[] args) {
        // 객체 생성
        _01_A b1 = new _01_B();
        _01_A b2 = new _01_B();

        // 메서드 호출
        b1.abc();
        b2.abc();
    }
}
