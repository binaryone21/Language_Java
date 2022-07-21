package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._01_추상_클래스;

abstract class _02_A {
    abstract void abc();
}

public class _02_AbstractClass_2 {
    public static void main(String[] args) {
        // 객체 생성
        _02_A a1 = new _02_A() {
            @Override
            void abc() {
                System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
            }
        };
        _02_A a2 = new _02_A() {
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
