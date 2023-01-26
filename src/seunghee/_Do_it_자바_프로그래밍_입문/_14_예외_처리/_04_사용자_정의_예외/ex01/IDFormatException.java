package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._04_사용자_정의_예외.ex01;

public class IDFormatException extends Exception {
    public IDFormatException(String message) {
        super(message);
    }
}
