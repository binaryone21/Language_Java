package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스.ex03;

interface A {
    public abstract void abc();
}

interface B {
    void bcd();     // public abstract 자동 추가
}

class C implements A {
    public void abc() {
        // ...
    }
}

/* public -> default 불가능
class D implements B {
    void bcd() {

    }
}
*/

public class InheritanceOfInterface_2 {
    public static void main(String[] args) {

    }
}
