package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

import java.util.Iterator;
import java.util.TreeSet;

public class _05_MemberTreeSet {
    private TreeSet<_05_Member> treeSet;

    public _05_MemberTreeSet() {
        treeSet = new TreeSet<>();
    }

    public void addMember(_05_Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<_05_Member> ir = treeSet.iterator();

        while(ir.hasNext()) {
            _05_Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(_05_Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
