package seunghee._혼자_공부하는_자바._10_예외_처리._02_예외_처리;

@SuppressWarnings({ "rawtypes", "unused" })
public class _01_TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
