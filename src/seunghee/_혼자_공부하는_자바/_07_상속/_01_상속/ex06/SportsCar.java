package seunghee._혼자_공부하는_자바._07_상속._01_상속.ex06;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10; }

	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
