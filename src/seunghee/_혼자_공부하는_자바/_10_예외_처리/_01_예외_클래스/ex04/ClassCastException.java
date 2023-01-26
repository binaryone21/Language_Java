package seunghee._혼자_공부하는_자바._10_예외_처리._01_예외_클래스.ex04;

@SuppressWarnings("unused")
public class ClassCastException {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		// if(animal instanceof Dog) {
		Dog dog = (Dog) animal;
		// }
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
