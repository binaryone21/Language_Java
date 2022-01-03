package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

public class _01_MemberHashMapTest {
    public static void main(String[] args) {
        _01_MemberHashMap memberHashMap = new _01_MemberHashMap();

        _01_Member memberLee = new _01_Member(1001, "이지원");
        _01_Member memberSon = new _01_Member(1002, "손민국");
        _01_Member memberPark = new _01_Member(1003, "박서훤");
        _01_Member memberHong = new _01_Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
    }
}
