package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex21;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);
	}
}
