package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버.ex04;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}
