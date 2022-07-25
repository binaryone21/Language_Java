package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스;

class _01_A {
    _01_C c = new _01_B();
    void abc() {
        c.bcd();
    }
    class _01_B implements _01_C {
        public void bcd() {
            System.out.println("인스턴스 이너 클래스");
        }
    }
}

interface _01_C {
    public abstract void bcd();
}
public class _01_AnonymousClass_1 {
    public static void main(String[] args) {
        // 객체 생성 및 메서드 호출
        _01_A a = new _01_A();
        a.abc();
    }
}
