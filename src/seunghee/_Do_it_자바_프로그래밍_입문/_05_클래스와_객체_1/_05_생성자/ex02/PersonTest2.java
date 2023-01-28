package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._05_생성자.ex02;

public class PersonTest2 {
	public static void main(String[] args) {
		Person2 personKim = new Person2();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;

		Person2 personLee = new Person2("이순신", 175, 75);
	}
}
