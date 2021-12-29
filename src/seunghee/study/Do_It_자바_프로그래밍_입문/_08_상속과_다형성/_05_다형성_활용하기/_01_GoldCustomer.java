package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._05_다형성_활용하기;

public class _01_GoldCustomer extends _01_Customer {
	double saleRatio;
	
	public _01_GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
