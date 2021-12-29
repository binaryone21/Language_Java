package seunghee.study.혼자_공부하는_자바._12_스레드._01_멀티_스레드;

public class _04_ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		_04_ThreadA threadA = new _04_ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		_04_ThreadB threadB = new _04_ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}
}
