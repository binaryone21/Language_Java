package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스;

public class _03_ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		_03_Circle circle = new _03_Circle(10, 20, 30);
		_03_Circle copyCircle = (_03_Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
