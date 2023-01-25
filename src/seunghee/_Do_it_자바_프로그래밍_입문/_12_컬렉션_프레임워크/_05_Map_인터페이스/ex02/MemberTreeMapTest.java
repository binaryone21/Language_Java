package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스.ex02;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

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
