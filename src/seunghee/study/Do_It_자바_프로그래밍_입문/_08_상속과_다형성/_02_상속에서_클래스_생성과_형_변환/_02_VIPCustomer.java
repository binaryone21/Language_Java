package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._02_상속에서_클래스_생성과_형_변환;

public class _02_VIPCustomer extends _02_Customer {
	private int agentID;
	double saleRatio;
	
	public _02_VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
