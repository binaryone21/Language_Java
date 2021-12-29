package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _01_MemberExample {
	public static void main(String[] args) {
		_01_Member obj1 = new _01_Member("blue");
		_01_Member obj2 = new _01_Member("blue");
		_01_Member obj3 = new _01_Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");
		}
	}
}
