package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._01_이너_클래스.ex02;

class A {
    int a = 3;
    int b = 4;
    void abc() {
        System.out.println("A 클래스 메서드");
    }

    // 인스턴스 이너 클래스 정의
    class B {
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
            System.out.println(A.this.a);
            System.out.println(A.this.b);
            A.this.abc();
        }
    }
}

public class UseMembersOfOuterClass {
    public static void main(String[] args) {
        // 아우터 클래스 객체 생성
        A a = new A();

        // 이너 클래스 객체 생성
        A.B b = a.new B();
        b.bcd();
    }
}
