package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._02_상속에서_클래스_생성과_형_변환;

public class _01_VIPCustomer extends _01_Customer {
	private int agentID;
	double saleRatio;
	
	public _01_VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
}
