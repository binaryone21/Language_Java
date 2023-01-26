package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._02_템플릿_메서드.ex01;

public class ManualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지합니다.");
	}
}
