package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스.ex08;

interface A {
    static void abc() {
        System.out.println("A 인터페이스의 정적 메서드 abc()");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // 정적 메서드 호출
        A.abc();
    }
}
