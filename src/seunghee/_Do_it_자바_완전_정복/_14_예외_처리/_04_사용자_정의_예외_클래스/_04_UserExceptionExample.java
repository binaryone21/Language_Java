package seunghee._Do_it_자바_완전_정복._14_예외_처리._04_사용자_정의_예외_클래스;

// 정수가 음수일 때 예외 발생
class _04_MinusException extends Exception {
    public _04_MinusException() {
        super();
    }
    public _04_MinusException(String message) {
        super(message);
    }
}

// 점수가 100점을 초과할 때 예외 발생
class _04_OverException extends Exception {
    public _04_OverException() {
        super();
    }
    public _04_OverException(String message) {
        super(message);
    }
}

class _04_A {
    void checkScore(int score) throws _04_MinusException, _04_OverException {
        if(score < 0) {
            throw new _04_MinusException("예외 발생 : 음숫값 입력");
        } else if(score > 100) {
            throw new _04_OverException("예외 발생 : 100점 초과");
        } else {
            System.out.println("정상적인 값입니다.");
        }
    }
}

public class _04_UserExceptionExample {
    public static void main(String[] args) {
        _04_A a = new _04_A();
        try {
            a.checkScore(85);
            a.checkScore(150);
        } catch (_04_MinusException | _04_OverException e) {
            System.out.println(e.getMessage());
        }
    }
}
