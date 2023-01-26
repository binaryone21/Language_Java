package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._04_사용자_정의_예외.ex01;

public class IDFormatTest {
    public static void main(String[] args) {
        IDFormat id = new IDFormat();

        String userID = null;
        try {
            id.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "1234567";
        try {
            id.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
