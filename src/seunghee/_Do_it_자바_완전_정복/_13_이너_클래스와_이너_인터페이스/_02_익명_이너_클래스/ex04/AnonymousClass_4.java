package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스.ex04;

interface A {
    public abstract void abc();;
}

// 자식 클래스 직접 생성
class B implements A {
    public void abc() {
        System.out.println("입력매개변수 전달");
    }
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class AnonymousClass_4 {
    public static void main(String[] args) {
        C c = new C();

        // 방법 1. 클래스명 O + 참조 변수명 O
        A a = new B();
        c.cde(a);

        // 방법 2. 클래스명 O + 참조 변수명 X
        c.cde(new B());
    }
}
