package seunghee._혼자_공부하는_자바._10_예외_처리._02_예외_처리;

@SuppressWarnings({ "unused", "rawtypes" })
public class _05_ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
