package seunghee._혼자_공부하는_자바._03_연산자._02_연산자의_종류.ex02;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------------");
		x++;
		++x;
		System.out.println("x = "+x);
		
		System.out.println("------------------------");
		y--;
		--y;
		System.out.println("x = "+y);
		
		System.out.println("------------------------");
		z = x++;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("------------------------");
		z= ++x;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		
		System.out.println("------------------------");
		z = ++x + y++;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
