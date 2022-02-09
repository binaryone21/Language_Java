package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _25_MathRandomExample {
	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈 : " + num);
	}
}
