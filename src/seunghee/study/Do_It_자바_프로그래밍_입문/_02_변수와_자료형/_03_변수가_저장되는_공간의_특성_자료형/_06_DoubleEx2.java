package seunghee.study.Do_It_자바_프로그래밍_입문._02_변수와_자료형._03_변수가_저장되는_공간의_특성_자료형;

public class _06_DoubleEx2 {
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 1000; i++) {
			dnum = dnum + 0.1;
		}
		
		System.out.println(dnum);
	}
}
