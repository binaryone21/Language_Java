package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._02_익명_이너_클래스.ex05;

interface A {
    public abstract void abc();
}

class C {
    void cde(A a) {
        a.abc();
    }
}

public class AnonymousClass_5 {
    public static void main(String[] args) {
        C c = new C();

        // 방법 3. 클래스명 X + 참조 변수명 O
        A a = new A() {
            @Override
            public void abc() {
                System.out.println("입력매개변수 전달");
            }
        };
        c.cde(a);

        // 방법 4. 클래스명 X + 참조 변수명 X
        c.cde(new A() {
            public void abc() {
                System.out.println("입력매개변수 전달");
            }
        });
    }
}
