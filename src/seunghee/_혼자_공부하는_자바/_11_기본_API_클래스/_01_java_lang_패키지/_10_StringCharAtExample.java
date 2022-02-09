package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _10_StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자 입니다."); break;
			case '2' :
			case '4' :
				System.out.println("여자 입니다."); break;
		}
	}
}
