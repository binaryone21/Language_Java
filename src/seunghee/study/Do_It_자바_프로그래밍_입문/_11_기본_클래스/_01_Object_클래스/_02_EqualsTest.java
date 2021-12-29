package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스;

public class _02_EqualsTest {
	public static void main(String[] args) {
		_02_Student studentLee = new _02_Student(100, "이상원");
		_02_Student studentLee2 = studentLee;
		_02_Student studentSang = new _02_Student(100, "이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		} else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang은 동일합니다.");
		} else {
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		}
		
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentLee.hashCode());
		
		System.out.println("studentLee의 실제 주소 값 : " + System.identityHashCode(studentLee));
		System.out.println("studentLee의 실제 주소 값 : " + System.identityHashCode(studentSang));

	}
}
