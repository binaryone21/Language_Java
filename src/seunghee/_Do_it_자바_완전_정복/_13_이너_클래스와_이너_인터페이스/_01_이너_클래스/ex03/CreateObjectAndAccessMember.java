package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._01_이너_클래스.ex03;

class A {
    int a = 3;
    static int b = 4;
    void method1() {
        System.out.println("instance method");
    }
    static void method2() {
        System.out.println("static method");
    }
    // 정적 이너 클래스
    static class B {
        void bcd() {
            // 필드 사용
            // System.out.println(a);
            System.out.println(b);

            // 메서드 호출
            // method1();
            method2();
        }
    }
}

public class CreateObjectAndAccessMember {
    public static void main(String[] args) {
        // 정적 이너 클래스의 객체 생성
        A.B b = new A.B();

        // 메서드 호출
        b.bcd();
    }
}
