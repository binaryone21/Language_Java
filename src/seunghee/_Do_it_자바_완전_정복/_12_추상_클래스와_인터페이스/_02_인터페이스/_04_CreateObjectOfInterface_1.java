package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _04_A {
    int a = 3;
    void abc();
}

class _04_B implements _04_A {
    public void abc() {
        System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
    }
}

public class _04_CreateObjectOfInterface_1 {
    public static void main(String[] args) {
        // 객체 생성
        _04_A b1 = new _04_B();
        _04_A b2 = new _04_B();

        // 메서드 호출
        b1.abc();
        b2.abc();
    }
}
