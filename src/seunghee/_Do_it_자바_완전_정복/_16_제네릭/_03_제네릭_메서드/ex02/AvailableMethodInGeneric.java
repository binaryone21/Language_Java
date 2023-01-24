package seunghee._Do_it_자바_완전_정복._16_제네릭._03_제네릭_메서드.ex02;

class A {
	public <T> void method(T t) {
		// System.out.println(t.length());
		System.out.println(t.equals("안녕"));
	}
}

public class AvailableMethodInGeneric {
	public static void main(String[] args) {
		A a = new A();
		a.<String>method("안녕");
	}
}
