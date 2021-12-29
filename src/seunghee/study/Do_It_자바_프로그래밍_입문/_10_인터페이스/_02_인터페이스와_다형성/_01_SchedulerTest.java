package seunghee.study.Do_It_자바_프로그래밍_입문._10_인터페이스._02_인터페이스와_다형성;

import java.io.IOException;

public class _01_SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		_01_Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new _01_RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new _01_LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new _01_PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
