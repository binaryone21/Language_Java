package seunghee.study.Do_It_자바_프로그래밍_입문._14_예외_처리._04_사용자_정의_예외;

public class _01_IDFormat {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws _01_IDFormatException {
        if(userID == null) {
            throw new _01_IDFormatException("아이디는 null일 수 없습니다.");
        } else if(userID.length() < 8 || userID.length() > 20) {
            throw new _01_IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
        }
        this.userID = userID;
    }
}
