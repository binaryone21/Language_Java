package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스.ex03;

public class Point {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + "," + "y = " + y;
	}
}
