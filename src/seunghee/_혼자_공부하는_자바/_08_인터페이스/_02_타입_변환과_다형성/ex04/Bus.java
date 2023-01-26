package seunghee._혼자_공부하는_자바._08_인터페이스._02_타입_변환과_다형성.ex04;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

