package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._04_다형성.ex01;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
