package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._01_final_제어자;

class _02_A {
    void abc() {}
    final void bcd() {}
}

class _02_B extends _02_A {
    void abc() {}
    // void bcd() {} -> final 메서드는 오버라이딩 불가능
}

final class _02_C {}
// class _02_D extends _02_C {} -> final 클래스는 상속 자체가 불가능

public class _02_FinalModifier_2 {
    public static void main(String[] args) {

    }
}
