package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._01_상속이란;

public class _02_VIPCustomer extends _02_Customer {
	private int agentID;	// VIP고객 상담원 아이디
	double saleRatio;		// 할인율
	
	public _02_VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
