package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._05_Map_인터페이스;

import seunghee.coding.example._5_final._01;

import java.util.Iterator;
import java.util.TreeMap;

public class _02_MemberTreeMap {
    private TreeMap<Integer, _01_Member> treeMap;

    public _02_MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(_01_Member member) {
        treeMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if(treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while(ir.hasNext()) {
            int key = ir.next();
            _01_Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
