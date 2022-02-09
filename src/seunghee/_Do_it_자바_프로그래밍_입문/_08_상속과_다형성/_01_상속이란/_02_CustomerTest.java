package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._01_상속이란;

public class _02_CustomerTest {
	public static void main(String[] args) {
		_02_Customer customerLee = new _02_Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		_02_VIPCustomer customerKim = new _02_VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
