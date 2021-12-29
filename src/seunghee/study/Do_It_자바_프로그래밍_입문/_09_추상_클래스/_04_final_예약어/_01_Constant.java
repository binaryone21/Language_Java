package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._04_final_예약어;

public class _01_Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		_01_Constant cons = new _01_Constant();
		cons.num = 50;
		cons.num = 200;
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
	}
}
