package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _05_A {
    int a = 3;
    void abc();
}

public class _05_CreateObjectOfInterface_2 {
    public static void main(String[] args) {
        // 객체 생성
        _05_A a1 = new _05_A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
            }
        };
        _05_A a2 = new _05_A() {
            @Override
            public void abc() {
                System.out.println("방법 2. 익명 이너 클래스를 이요한 객체 생성");
            }
        };

        // 메서드 호출
        a1.abc();
        a2.abc();
    }
}
