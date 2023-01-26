package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스.ex02;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

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
