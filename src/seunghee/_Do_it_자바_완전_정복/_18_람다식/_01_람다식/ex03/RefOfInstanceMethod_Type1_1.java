package seunghee._Do_it_자바_완전_정복._18_람다식._01_람다식.ex03;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메서드");
	}
}

public class RefOfInstanceMethod_Type1_1 {
	public static void main(String[] args) {
		// 1. 익명 이너 클래스
		A a1 = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();
			}
		};

		// 2. 람다식으로 표현
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};

		// 3. 정의된 인스턴스 메서드 참조
		B b = new B();
		A a3 = b::bcd;
		a1.abc();
		a2.abc();
		a3.abc();
	}
}
