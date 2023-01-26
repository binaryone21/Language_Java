package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _06_ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// 첫 번째 방법
		Class key1 = _02_Key.class;
		
		// 두 번째 방법
		Class key2 = Class.forName("seunghee._01_study._02_혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지._02_Key");
		
		// 세번쨰 방법
		_02_Key key = new _02_Key(1);
		Class key3 = key.getClass();
		
		System.out.println(key1.getName());
		System.out.println(key2.getSimpleName());
		System.out.println(key3.getPackage().getName());
		
	}
}
