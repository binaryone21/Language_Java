package seunghee.study.Do_It_자바_프로그래밍_입문._10_인터페이스._03_인터페이스_요소_살펴보기;

public class _01_CompleteCalc extends _01_Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1/num2;
		} else {
			return ERROR;
		}
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
	@Override
	public void description() {
		super.description();
	}
}
