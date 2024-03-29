package seunghee._Do_it_자바_완전_정복._14_예외_처리._04_사용자_정의_예외_클래스.ex02;

public class ExceptionMethod_1 {
    public static void main(String[] args) {

        // 1. 예외 객체를 생성했을 때 메시지를 전달하지 않았을 경우
        try {
            throw new Exception();  // 예외 발생
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 2. 예외 객체를 생성했을 때 메시지를 전달했을 경우
        try {
            throw new Exception("예외 메시지");  // 예외 발생
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
