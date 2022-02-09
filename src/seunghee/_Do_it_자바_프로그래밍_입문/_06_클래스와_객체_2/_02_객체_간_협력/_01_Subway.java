package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._02_객체_간_협력;

public class _01_Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public _01_Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber+"의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다.");
	}
}
