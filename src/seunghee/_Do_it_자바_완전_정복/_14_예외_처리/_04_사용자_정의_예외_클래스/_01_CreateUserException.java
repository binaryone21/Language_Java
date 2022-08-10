package seunghee._Do_it_자바_완전_정복._14_예외_처리._04_사용자_정의_예외_클래스;

// 1. 사용자 일반 예외
class _01_MyException extends Exception {
    public _01_MyException() {
        super();
    }
    public _01_MyException(String message) {
        super(message);
    }
}

// 2. 사용자 실행 예외
class _01_MyRTException extends RuntimeException {
    public _01_MyRTException() {
        super();
    }
    public _01_MyRTException(String message) {
        super(message);
    }
}

class _01_A {
    // 3. 사용자 정의 예외 객체 생성
    _01_MyException me1 = new _01_MyException();
    _01_MyException me2 = new _01_MyException("예외 메시지 : MyException");

    _01_MyRTException mre1 = new _01_MyRTException();
    _01_MyRTException mre2 = new _01_MyRTException("예외 메시지 : MyRTException");

    // 4. 예외 던지기(thros) : 던진 시점에서 예외 발생
    // 방법 1. 예외를 직접 처리
    void abc_1(int num) {
        try {
            if(num > 70) {
                System.out.println("정상 작동");
            } else {
                throw me1;  // 예외를 던진 시점에 예외 발생
            }
        } catch (_01_MyException e) {
            System.out.println("예외 처리 1");
        }
    }
    void bcd_1() {
        abc_1(65);
    }

    // 방법 2. 예외 전가
    void abc_2(int num) throws _01_MyException {
        if(num > 70) {
            System.out.println("정상 작동");
        } else {
            throw me1;  // 예외를 던진 시점에 예외 발생
        }
    }
    void bcd_2() {
        try {
            abc_2(65);
        } catch (_01_MyException e) {
            System.out.println("예외 처리 2");
        }
    }
}

public class _01_CreateUserException {
    public static void main(String[] args) {
        _01_A a = new _01_A();
        a.bcd_1();
        a.bcd_2();
    }
}
