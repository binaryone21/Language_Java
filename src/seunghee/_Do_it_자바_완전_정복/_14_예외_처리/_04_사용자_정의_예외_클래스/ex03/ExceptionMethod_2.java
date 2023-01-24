package seunghee._Do_it_자바_완전_정복._14_예외_처리._04_사용자_정의_예외_클래스.ex03;

class A {
    void abc() throws NumberFormatException {
        bcd();
    }
    void bcd() throws NumberFormatException {
        cde();
    }
    void cde() throws NumberFormatException {
        int num = Integer.parseInt("10A");
    }
}

public class ExceptionMethod_2 {
    public static void main(String[] args) {
        // 1. 객체 생성
        A a = new A();
        // 2. 메서드 호출 + 예외 처리
        try {
            a.abc();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
