package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

import seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._02_컬렉션_프레임워크.Member;

public class _02_MemberHashSetTest {
    public static void main(String[] args) {
        _02_MemberHashSet memberHashSet = new _02_MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");

        memberHashSet.addMemeber(memberLee);
        memberHashSet.addMemeber(memberSon);
        memberHashSet.addMemeber(memberPark);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberHashSet.addMemeber(memberHong);
        memberHashSet.showAllMember();
    }
}
