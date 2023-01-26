package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._02_상속에서_클래스_생성과_형_변환.ex02;

public class CustomerTest {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 1); // 하위 클래스 생성
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}
}
