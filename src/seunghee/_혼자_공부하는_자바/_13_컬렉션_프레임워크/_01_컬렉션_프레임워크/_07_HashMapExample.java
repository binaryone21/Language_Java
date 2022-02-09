package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

import java.util.HashMap;
import java.util.Map;

public class _07_HashMapExample {
	public static void main(String[] args) {
		Map<_07_Student, Integer> map = new HashMap<_07_Student, Integer>();
		
		map.put(new _07_Student(1, "홍길동"), 95);
		map.put(new _07_Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수 : " + map.size());
	}
}
