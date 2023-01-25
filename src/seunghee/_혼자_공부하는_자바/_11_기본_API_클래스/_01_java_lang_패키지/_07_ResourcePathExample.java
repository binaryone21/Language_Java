package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _07_ResourcePathExample {
	public static void main(String[] args) {
		Class c1 = _02_Key.class;
		
		String photo1Path = c1.getResource("photo1.jpg").getPath();
		String photo2Path = c1.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
