package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex04;

public class ExitExample {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);
			}
		}
		System.out.println("마무리 코드");
	}
}
