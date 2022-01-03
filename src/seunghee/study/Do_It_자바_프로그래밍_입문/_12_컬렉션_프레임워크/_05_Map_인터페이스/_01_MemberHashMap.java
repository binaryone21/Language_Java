package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

import java.util.HashMap;
import java.util.Iterator;

public class _01_MemberHashMap {
    private HashMap<Integer, _01_Member> hashMap;

    public _01_MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(_01_Member member) {
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if(hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            _01_Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
