package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _04_SingletonExample {
	public static void main(String[] args) {
		/*
		 * _04_Singleton obj1 = new _04_Singleton(); 
		 * _04_Singleton obj2 = new _04_Singleton(); 
		 */
		
		_04_Singleton obj1 = _04_Singleton.getInstance();
		_04_Singleton obj2 = _04_Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
