package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._01_추상_클래스.ex02;

abstract class A {
    abstract void abc();
}

public class AbstractClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };
        A a2 = new A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };

        // 메서드 호출
        a1.abc();
        a2.abc();
    }
}
