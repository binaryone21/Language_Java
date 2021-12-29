package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._02_상속에서_클래스_생성과_형_변환;

public class _01_CustomerTest {
	public static void main(String[] args) {
		_01_VIPCustomer customerKim = new _01_VIPCustomer(); // 하위 클래스 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
