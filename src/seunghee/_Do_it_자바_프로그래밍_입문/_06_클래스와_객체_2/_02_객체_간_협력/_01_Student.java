package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._02_객체_간_협력;

public class _01_Student {
	public String studentName;
	public int grade;
	public int money;
	
	public _01_Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(_01_Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(_01_Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"입니다.");
	}
}