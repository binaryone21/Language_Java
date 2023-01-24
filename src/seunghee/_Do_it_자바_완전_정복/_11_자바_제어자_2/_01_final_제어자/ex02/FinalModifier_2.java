package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._01_final_제어자.ex02;

class A {
    void abc() {}
    final void bcd() {}
}

class B extends A {
    void abc() {}
    // void bcd() {} -> final 메서드는 오버라이딩 불가능
}

final class C {}
// class D extends C {} -> final 클래스는 상속 자체가 불가능

public class FinalModifier_2 {
    public static void main(String[] args) {

    }
}
