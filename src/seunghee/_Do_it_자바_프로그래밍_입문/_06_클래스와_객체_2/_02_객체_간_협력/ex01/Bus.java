package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._02_객체_간_협력.ex01;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount+"먕이고, 수입은 "+money+"입니다.");
	}
}
