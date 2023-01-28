package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._02_인터페이스와_다형성.ex01;

public class PriorityAllocation implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선적으로 배분합니다.");
	}
}
