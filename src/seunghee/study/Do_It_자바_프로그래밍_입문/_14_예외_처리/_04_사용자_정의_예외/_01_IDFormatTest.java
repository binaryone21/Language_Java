package seunghee.study.Do_It_자바_프로그래밍_입문._14_예외_처리._04_사용자_정의_예외;

public class _01_IDFormatTest {
    public static void main(String[] args) {
        _01_IDFormat id = new _01_IDFormat();

        String userID = null;
        try {
            id.setUserID(userID);
        } catch (_01_IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567";
        try {
            id.setUserID(userID);
        } catch (_01_IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
