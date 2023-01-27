package seunghee._혼자_공부하는_자바._12_스레드._01_멀티_스레드.ex04;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}
}
