package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

import java.util.Comparator;

public class _05_Member implements Comparator<_05_Member> {
    private int memberId;
    private String memberName;

    public _05_Member(int memberId, String memberName) {
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

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof _05_Member) {
            _05_Member member = (_05_Member) obj;
            if(this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int compare(_05_Member mem1, _05_Member mem2) {
        return mem1.getMemberId() - mem2.getMemberId();
    }
}
