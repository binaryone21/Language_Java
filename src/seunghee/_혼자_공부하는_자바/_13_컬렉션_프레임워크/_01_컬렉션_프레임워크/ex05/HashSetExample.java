package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크.ex05;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add( new Member("홍길동", 30));
		set.add( new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
	}
}
