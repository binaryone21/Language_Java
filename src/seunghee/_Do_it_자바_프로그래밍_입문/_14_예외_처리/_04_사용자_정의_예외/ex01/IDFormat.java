package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._04_사용자_정의_예외.ex01;

public class IDFormat {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException {
        if(userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if(userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }
}
