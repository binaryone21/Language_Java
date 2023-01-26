package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버.ex04;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
