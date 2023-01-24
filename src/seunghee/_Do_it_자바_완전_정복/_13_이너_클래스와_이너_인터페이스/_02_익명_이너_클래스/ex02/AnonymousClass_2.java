package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스.ex02;

class A {
    C c = new C() {
        @Override
        public void bcd() {
            System.out.println("익명 이너 클래스");
        }
    };
    void abc() {
        c.bcd();
    }
}

interface C {
    public abstract void bcd();
}
public class AnonymousClass_2 {
    public static void main(String[] args) {
        // 객체 생성 및 메서드 호출
        A a = new A();
        a.abc();
    }
}
