package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스;

interface _03_C {
    public abstract void bcd();
}

class _03_B implements _03_C {
    public void bcd() {
        System.out.println("B의 bcd 메서드 구현");
    }
    public void cde() {
        System.out.println("B의 cde 메서드 구현");
    }
}

public class _03_AnonymousClass_3 {
    public static void main(String[] args) {
        _03_B b = new _03_B();
        b.bcd();
        b.cde();

        _03_C c = new _03_C() {
            public void bcd() {
                System.out.println("C의 bcd 메서드 구현");
                cde();
            }
            public void cde() {
                System.out.println("C의 cde 메서드 구현");
            }
        };

        c.bcd();
        // c.cde();
    }
}
