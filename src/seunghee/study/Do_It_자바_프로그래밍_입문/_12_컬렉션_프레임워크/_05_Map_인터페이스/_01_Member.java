package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

public class _01_Member {
    private int memberId;
    private String memberName;

    public _01_Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }
}
