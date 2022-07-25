package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._03_이너_인터페이스;

class _01_A {
    interface _01_B {
        public abstract void bcd();
    }
}

class _01_C implements _01_A._01_B {
    public void bcd() {
        System.out.println("이너 인터페이스 구현 클래스 생성");
    }
}

public class _01_CreateObjectOfInnerInterface {
    public static void main(String[] args) {
        // 객체 생성 방법 1(자식 클래스 직접 생성)
        _01_A._01_B ab = new _01_C();
        _01_C c = new _01_C();
        c.bcd();

        // 객체 생성 방법 2(익명 이너 클래스 생성)
        _01_A._01_B b = new _01_A._01_B() {
            public void bcd() {
                System.out.println("익명 이너 클래스로 객체 생성");
            }
        };
        b.bcd();
    }
}
