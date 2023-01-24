package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스.ex03;

interface C {
    public abstract void bcd();
}

class B implements C {
    public void bcd() {
        System.out.println("B의 bcd 메서드 구현");
    }
    public void cde() {
        System.out.println("B의 cde 메서드 구현");
    }
}

public class AnonymousClass_3 {
    public static void main(String[] args) {
        B b = new B();
        b.bcd();
        b.cde();

        C c = new C() {
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
