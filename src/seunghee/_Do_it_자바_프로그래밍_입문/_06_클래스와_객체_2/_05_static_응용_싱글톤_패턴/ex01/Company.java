package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._05_static_응용_싱글톤_패턴.ex01;

public class Company {
	private static Company instance = new Company();
	private Company() {	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
