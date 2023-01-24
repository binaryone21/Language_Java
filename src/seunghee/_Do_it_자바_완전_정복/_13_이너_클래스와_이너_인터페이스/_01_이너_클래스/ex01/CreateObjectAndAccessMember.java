package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._01_이너_클래스.ex01;

class A {
    public int a = 3;
    protected int b = 4;
    int c = 5;
    private int d = 6;
    void abc() {
        System.out.println("A 클래스 메서드 abc()");
    }

    // 인스턴스 이너 클래스
    class B {
        void bcd() {
            // 아우터 클래스의 필드 사용
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            // 아우터 클래스의 메서드 호출
            abc();
        }
    }
}

public class CreateObjectAndAccessMember {
    public static void main(String[] args) {
        // 아우터 클래스 객체 생성
        A a = new A();

        // 멤버 사용
        A.B b = a.new B();
        b.bcd();
    }
}
