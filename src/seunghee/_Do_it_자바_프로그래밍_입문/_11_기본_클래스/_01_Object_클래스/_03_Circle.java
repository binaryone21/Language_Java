package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스;

public class _03_Circle implements Cloneable {
	_03_Point point;
	int radius;
	
	_03_Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new _03_Point(x, y);
	}
	
	public String toString() {
		return "원점은 " + point + "이고," + "반지름은 " + radius + "입니다.";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
