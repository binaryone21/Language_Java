package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex06;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// 첫 번째 방법
		Class key1 = Key.class;
		
		// 두 번째 방법
		Class key2 = Class.forName("seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex06.Key");
		
		// 세번쨰 방법
		Key key = new Key(1);
		Class key3 = key.getClass();
		
		System.out.println(key1.getName());
		System.out.println(key2.getSimpleName());
		System.out.println(key3.getPackage().getName());
	}
}
