package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._02_객체_간_협력;

public class _01_TakeTrans {
	public static void main(String[] args) {
		_01_Student studentJames = new _01_Student("James", 5000);
		_01_Student studentTomas = new _01_Student("Tomas", 10000);
		
		_01_Bus bus100 = new _01_Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();
		
		_01_Subway subwayGreen = new _01_Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
