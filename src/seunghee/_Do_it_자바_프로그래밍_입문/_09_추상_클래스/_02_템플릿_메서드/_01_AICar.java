package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._02_템플릿_메서드;

public class _01_AICar extends _01_Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 알아서 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춥니다.");
	}
}
