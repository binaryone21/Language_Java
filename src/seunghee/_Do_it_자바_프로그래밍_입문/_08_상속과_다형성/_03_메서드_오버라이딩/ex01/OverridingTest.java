package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩.ex01;

public class OverridingTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()+" 님이 지불해야 하는 금액은 "+customerLee.calcPrice(price)+"원입니다.");
		System.out.println(customerKim.getCustomerName()+" 님이 지불해야 하는 금액은 "+customerKim.calcPrice(price)+"원입니다.");
	}
}
