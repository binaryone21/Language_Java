package seunghee._Do_it_자바_완전_정복._17_컬렉션_프레임워크._04_Map_컬렉션_인터페이스.ex05;

import java.util.TreeMap;

public class asd {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		for(int i=20; i>0; i-=2)
			treeMap.put(i, i + "번째 데이터");
		System.out.println(treeMap.toString());
	}
}
