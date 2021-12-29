package seunghee.study.혼자_공부하는_자바._06_클래스._04_메소드;

public class _03_CarExample {
	public static void main(String[] args) {
		_03_Car myCar = new _03_Car();
		
		myCar.setGas(5);	//	 Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();	// Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();	//	Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {	// Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
