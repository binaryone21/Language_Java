package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._03_이너_인터페이스.ex01;

class A {
    interface B {
        public abstract void bcd();
    }
}

class C implements A.B {
    public void bcd() {
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}

public class CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        // 객체 생성 방법 1(자식 클래스 직접 생성)
        A.B ab = new C();
        C c = new C();
        c.bcd();

        // 객체 생성 방법 2(익명 이너 클래스 생성)
        A.B b = new A.B() {
            public void bcd() {
                System.out.println("익명 이너 클래스로 객체 생성");
            }
        };
        b.bcd();
    }
}
