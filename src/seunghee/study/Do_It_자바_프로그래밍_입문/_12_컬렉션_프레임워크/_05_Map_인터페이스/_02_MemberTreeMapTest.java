package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

public class _02_MemberTreeMapTest {
    public static void main(String[] args) {
        _02_MemberTreeMap memberTreeMap = new _02_MemberTreeMap();

        _01_Member memberPark = new _01_Member(1003, "박서훤");
        _01_Member memberLee = new _01_Member(1001, "이지원");
        _01_Member memberHong = new _01_Member(1004, "홍길동");
        _01_Member memberSon = new _01_Member(1002, "손민국");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
