package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._04_다형성;

public class _01_AnimalTest {
	public static void main(String[] args) {
		_01_AnimalTest aTest = new _01_AnimalTest();
		aTest.moveAnimal(new _01_Human());
		aTest.moveAnimal(new _01_Tiger());
		aTest.moveAnimal(new _01_Eagle());
	}
	
	public void moveAnimal(_01_Animal animal) {
		animal.move();
	}
}
