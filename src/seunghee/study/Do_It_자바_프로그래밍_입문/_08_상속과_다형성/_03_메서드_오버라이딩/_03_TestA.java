package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩;

public class _03_TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		_03_TestA a1 = new _03_TestA();
		a1.aaa();
		_03_TestA a2 = new _03_TestA();
		a2.aaa();
	}
}
