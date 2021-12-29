package seunghee.study.혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _04_Singleton {
	private static _04_Singleton singleton = new _04_Singleton();
	
	private _04_Singleton() {}
	
	static _04_Singleton getInstance() {
		return singleton;
	}
}
