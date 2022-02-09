package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._05_static_응용_싱글톤_패턴;

public class _01_Company {
	private static _01_Company instance = new _01_Company();
	private _01_Company() {	}
	
	public static _01_Company getInstance() {
		if(instance == null) {
			instance = new _01_Company();
		}
		return instance;
	}
}
