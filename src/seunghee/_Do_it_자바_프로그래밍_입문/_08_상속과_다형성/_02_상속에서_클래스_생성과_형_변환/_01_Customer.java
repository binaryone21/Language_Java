package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._02_상속에서_클래스_생성과_형_변환;

public class _01_Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public _01_Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은 "+customerGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
