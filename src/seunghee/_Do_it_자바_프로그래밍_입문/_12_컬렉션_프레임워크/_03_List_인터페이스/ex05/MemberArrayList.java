package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스.ex05;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = arrayList.iterator();
        while(ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId +  "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
