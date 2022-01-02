package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스;

import seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._02_컬렉션_프레임워크.Member;

public class _05_MemberArrayListTest {
    public static void main(String[] args) {
        _05_MemberArrayList memberArrayList = new _05_MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서훤");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberHong.getMemberId());
        memberArrayList.showAllMember();
    }
}
