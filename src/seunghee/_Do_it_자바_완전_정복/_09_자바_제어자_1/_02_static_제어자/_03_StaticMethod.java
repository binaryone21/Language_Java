package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._02_static_제어자;

class _03_A {
    void abc() {
        // 인스턴스 메서드
        System.out.println("instance 메서드");
    }
    static void bcd() {
        // 정적 메서드
        System.out.println("static 메서드");
    }
}

public class _03_StaticMethod {
    public static void main(String[] args) {
        // 인스턴스 메서드 활용(객체를 생성한 후 사용 가능)
        _03_A a1 = new _03_A();
        a1.abc();

        // 정적 메서드 활용
        // 1. 클래스명으로 바로 접근해 사용
        _03_A.bcd();

        // 2. 객체를 생성한 후 사용(권장하지 않음)
        _03_A a2 = new _03_A();
        a2.bcd();
    }
}
