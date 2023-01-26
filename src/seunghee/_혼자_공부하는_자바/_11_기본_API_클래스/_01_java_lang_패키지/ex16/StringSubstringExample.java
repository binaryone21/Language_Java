package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex16;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
