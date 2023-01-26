package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩.ex03;

public class TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.aaa();
		TestA a2 = new TestA();
		a2.aaa();
	}
}
