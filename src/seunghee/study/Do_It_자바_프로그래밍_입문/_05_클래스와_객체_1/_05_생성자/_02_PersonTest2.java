package seunghee.study.Do_It_자바_프로그래밍_입문._05_클래스와_객체_1._05_생성자;

public class _02_PersonTest2 {
	public static void main(String[] args) {
		_02_Person2 personKim = new _02_Person2();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		@SuppressWarnings("unused")
		_02_Person2 personLee = new _02_Person2("이순신", 175, 75);
		
	}
}
