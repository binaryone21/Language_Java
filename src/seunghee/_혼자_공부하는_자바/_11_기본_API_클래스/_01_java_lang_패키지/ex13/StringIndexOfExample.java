package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex13;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
