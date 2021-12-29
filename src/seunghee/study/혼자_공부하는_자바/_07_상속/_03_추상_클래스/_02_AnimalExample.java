package seunghee.study.혼자_공부하는_자바._07_상속._03_추상_클래스;

public class _02_AnimalExample {
	public static void main(String[] args) {
		_02_Dog dog = new _02_Dog();
		_02_Cat cat = new _02_Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------");
		
		// 변수의 자동 타입 변환
		_02_Animal animal = null;
		animal = new _02_Dog();
		animal.sound();
		animal = new _02_Cat();
		animal.sound();
		System.out.println("---------");
		
		// 메소드의 다형성
		animalSound(new _02_Dog());
		animalSound(new _02_Cat());
	}
	
	public static void animalSound(_02_Animal animal) {
		animal.sound();
	}
}
