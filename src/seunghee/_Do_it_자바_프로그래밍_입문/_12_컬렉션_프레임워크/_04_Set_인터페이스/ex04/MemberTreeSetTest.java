package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스.ex04;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, " 홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
