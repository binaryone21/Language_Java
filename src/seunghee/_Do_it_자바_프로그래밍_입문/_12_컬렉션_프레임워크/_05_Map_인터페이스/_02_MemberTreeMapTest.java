package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

import seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._02_컬렉션_프레임워크.Member;

public class _02_MemberTreeMapTest {
    public static void main(String[] args) {
        _02_MemberTreeMap memberTreeMap = new _02_MemberTreeMap();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberSon = new Member(1002, "손민국");

        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberHong);
        memberTreeMap.addMember(memberSon);

        memberTreeMap.showAllMember();

        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
    }
}
