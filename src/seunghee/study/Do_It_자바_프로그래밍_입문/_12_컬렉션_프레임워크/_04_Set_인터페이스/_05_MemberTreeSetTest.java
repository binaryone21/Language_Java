package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

public class _05_MemberTreeSetTest {
    public static void main(String[] args) {
        _05_MemberTreeSet memberTreeSet = new _05_MemberTreeSet();

        _05_Member memberPark = new _05_Member(1003, "박서훤");
        _05_Member memberLee = new _05_Member(1001, "이지원");
        _05_Member memberSon = new _05_Member(1002, "손민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        _05_Member memberHong = new _05_Member(1003, " 홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
