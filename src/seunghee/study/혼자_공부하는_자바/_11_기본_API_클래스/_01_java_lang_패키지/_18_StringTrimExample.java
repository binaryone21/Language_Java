package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _18_StringTrimExample {
	public static void main(String[] args) {
		String tel1 = "   02";
		String tel2 = "123   ";
		String tel3 = "    1234   ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel);
	}
}
