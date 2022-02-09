package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _04_HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBatis");
		
		System.out.println("총 객체수  : " + set.size());
		
		iterator = set.iterator();
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
