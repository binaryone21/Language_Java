package seunghee.study.혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

import java.util.HashSet;
import java.util.Set;

public class _05_HashSetExample {
	public static void main(String[] args) {
		Set<_05_Member> set = new HashSet<_05_Member>();
		
		set.add( new _05_Member("홍길동", 30));
		set.add( new _05_Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}
}
