package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

public class _04_MemberTreeSetTest {
    public static void main(String[] args) {
        _04_MemberTreeSet memberTreeSet = new _04_MemberTreeSet();

        _04_Member memberPark = new _04_Member(1003, "박서훤");
        _04_Member memberLee = new _04_Member(1001, "이지원");
        _04_Member memberSon = new _04_Member(1002, "손민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        _04_Member memberHong = new _04_Member(1003, " 홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
