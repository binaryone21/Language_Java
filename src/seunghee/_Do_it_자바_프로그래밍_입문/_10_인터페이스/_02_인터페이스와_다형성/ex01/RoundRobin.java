package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._02_인터페이스와_다형성.ex01;

public class RoundRobin implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
