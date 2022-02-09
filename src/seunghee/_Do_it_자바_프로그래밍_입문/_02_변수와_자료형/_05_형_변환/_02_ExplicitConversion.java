package seunghee._Do_it_자바_프로그래밍_입문._02_변수와_자료형._05_형_변환;

public class _02_ExplicitConversion {
	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum4 = (int)dNum1 + (int)fNum2;
		int iNum3 = (int)(dNum1 + fNum2);
		
		System.out.println(iNum3);
		System.out.println(iNum4);
	}
}
