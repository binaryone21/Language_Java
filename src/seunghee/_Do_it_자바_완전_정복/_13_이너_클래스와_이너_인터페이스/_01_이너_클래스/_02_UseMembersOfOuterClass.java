package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._01_이너_클래스;

class _02_A {
    int a = 3;
    int b = 4;
    void abc() {
        System.out.println("A 클래스 메서드");
    }

    // 인스턴스 이너 클래스 정의
    class _02_B {
        int a = 5;
        int b = 6;
        void abc() {
            System.out.println("B 클래스 메서드");
        }
        void bcd() {
            // 이너 클래스의 멤버 호출 또는 사용
            System.out.println(a);
            System.out.println(b);
            abc();

            // 아우터 클래스의 멤버 호출 또는 사용
            System.out.println(_02_A.this.a);
            System.out.println(_02_A.this.b);
            _02_A.this.abc();
        }
    }
}

public class _02_UseMembersOfOuterClass {
    public static void main(String[] args) {
        // 아우터 클래스 객체 생성
        _02_A a = new _02_A();

        // 이너 클래스 객체 생성
        _02_A._02_B b = a.new _02_B();
        b.bcd();
    }
}
