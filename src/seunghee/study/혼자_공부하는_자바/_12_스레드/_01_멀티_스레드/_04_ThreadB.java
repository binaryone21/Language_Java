package seunghee.study.혼자_공부하는_자바._12_스레드._01_멀티_스레드;

public class _04_ThreadB extends Thread {
	public _04_ThreadB() {
		setName("ThreadB");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
