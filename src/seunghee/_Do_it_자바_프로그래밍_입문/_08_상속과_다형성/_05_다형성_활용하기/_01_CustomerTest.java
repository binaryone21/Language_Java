package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._05_다형성_활용하기;

import java.util.ArrayList;

public class _01_CustomerTest {
	public static void main(String[] args) {
		ArrayList<_01_Customer> customerList = new ArrayList<_01_Customer>();
		
		_01_Customer customerLee = new _01_Customer(10010, "이순신");
		_01_Customer customerShin = new _01_Customer(10020, "심사임당");
		_01_Customer customerHong = new _01_GoldCustomer(10030, "홍길동");
		_01_Customer customerYoul = new _01_GoldCustomer(10040, "이율곡");
		_01_Customer customerKim = new _01_VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("==== 고객 정보 출력 =====");
		for(_01_Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for(_01_Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트는 "+customer.bonusPoint+"점입니다.");
		}
	}
}
