package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._04_다형성;

public class _02_VIPCustomer extends _02_Customer {
	private int agentID;
	double saleRatio;
	
	public _02_VIPCustomer(int customerID, String customerName, int agentID) {
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
	
	public String showCustomerInfo() {
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID+"입니다";
	}
}
