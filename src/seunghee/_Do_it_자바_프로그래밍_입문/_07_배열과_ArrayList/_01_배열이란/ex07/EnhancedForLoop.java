package seunghee._Do_it_자바_프로그래밍_입문._07_배열과_ArrayList._01_배열이란.ex07;

public class EnhancedForLoop {
	public static void main(String[] args) {
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String lang : strArray) {
			System.out.println(lang);
		}
	}
}
