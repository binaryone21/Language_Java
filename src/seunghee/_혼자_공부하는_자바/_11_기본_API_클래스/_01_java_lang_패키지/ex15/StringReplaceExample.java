package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex15;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
