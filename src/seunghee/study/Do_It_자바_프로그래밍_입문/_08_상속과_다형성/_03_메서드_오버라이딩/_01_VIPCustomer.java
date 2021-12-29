package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩;

public class _01_VIPCustomer extends _01_Customer {
	private int agentID;
	double saleRatio;
	
	public _01_VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
