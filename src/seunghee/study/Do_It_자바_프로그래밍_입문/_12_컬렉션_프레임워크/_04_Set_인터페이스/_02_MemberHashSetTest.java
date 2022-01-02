package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

import seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._02_컬렉션_프레임워크.Member;

import javax.swing.plaf.metal.MetalMenuBarUI;

public class _02_MemberHashSetTest {
    public static void main(String[] args) {
        _02_MemberHashSet memberHashSet = new _02_MemberHashSet();

        _02_Member memberLee = new _02_Member(1001, "이지원");
        _02_Member memberSon = new _02_Member(1002, "손민국");
        _02_Member memberPark = new _02_Member(1003, "박서훤");
        
        memberHashSet.addMemeber(memberLee);
        memberHashSet.addMemeber(memberSon);
        memberHashSet.addMemeber(memberPark);
        memberHashSet.showAllMember();

        _02_Member memberHong = new _02_Member(1003, "홍길동");
        memberHashSet.addMemeber(memberHong);
        memberHashSet.showAllMember();
    }
}
