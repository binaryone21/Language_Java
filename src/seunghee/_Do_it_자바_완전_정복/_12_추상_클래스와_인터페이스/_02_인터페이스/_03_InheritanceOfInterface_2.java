package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _03_A {
    public abstract void abc();
}

interface _03_B {
    void bcd();     // public abstract 자동 추가
}

class _03_C implements _03_A {
    public void abc() {
        // ...
    }
}

/* public -> default 불가능
class _03_D implements _03_B {
    void bcd() {

    }
}
*/

public class _03_InheritanceOfInterface_2 {
    public static void main(String[] args) {

    }
}
