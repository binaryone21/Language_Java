package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _06_A {
    void abc();
    default void bcd() {
        System.out.println("A 인터페이스의 bcd()");
    }
}

class _06_B implements _06_A {
    public void abc() {
        System.out.println("B 클래스의 abc()");
    }
}

class _06_C implements _06_A {
    public void abc() {
        System.out.println("C 클래스의 abc()");
    }
    public void bcd() {
        System.out.println("C 클래스의 bcd()");
    }
}

public class _06_DefaultMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        _06_A a1 = new _06_B();
        _06_A a2 = new _06_C();

        // 메서드 호출
        a1.abc();
        a1.bcd();
        a2.abc();
        a2.bcd();
    }
}
