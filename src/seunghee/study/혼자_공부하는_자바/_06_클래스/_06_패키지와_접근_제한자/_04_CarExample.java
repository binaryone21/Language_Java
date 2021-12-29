package seunghee.study.혼자_공부하는_자바._06_클래스._06_패키지와_접근_제한자;

public class _04_CarExample {
	public static void main(String[] args) {
		_04_Car myCar = new _04_Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
	
		System.out.println("현재 속도 : "+myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도 : "+myCar.getSpeed());

		// 멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : "+myCar.getSpeed());
	}
}
