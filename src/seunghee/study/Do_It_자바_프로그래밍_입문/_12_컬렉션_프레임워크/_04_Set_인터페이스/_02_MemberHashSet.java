package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스;

import seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._02_컬렉션_프레임워크.Member;

import java.util.HashSet;
import java.util.Iterator;

public class _02_MemberHashSet {
    private HashSet<_02_Member> hashSet;

    public _02_MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMemeber(_02_Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<_02_Member> ir = hashSet.iterator();

        while(ir.hasNext()) {
            _02_Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(_02_Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
