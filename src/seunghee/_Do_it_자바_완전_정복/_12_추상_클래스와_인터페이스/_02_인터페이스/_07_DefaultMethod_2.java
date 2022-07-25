package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _07_A {
    default void abc() {
        System.out.println("A 인터페이스의 abc()");
    }
}

class _07_B implements _07_A {
    public void abc() {
        _07_A.super.abc();  // 부모 인터페이스 A의 abC() 메서드 호출
        System.out.println("B 클래스의 abc()");
    }
}

public class _07_DefaultMethod_2 {
    public static void main(String[] args) {
        // 객체 생성
        _07_B b = new _07_B();

        // 메서드 호출
        b.abc();
    }
}
