package seunghee._Do_it_자바_프로그래밍_입문._02_변수와_자료형._05_형_변환;

public class _01_ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
	}
}
