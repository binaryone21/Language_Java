package seunghee.study.Do_It_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩;

public class _04_OverridingTest {
	public static void main(String[] args) {
		int price = 10000;
		
		_01_Customer customerLee = new _01_Customer(10010, "이순신");
		System.out.println(customerLee.getCustomerName()+" 님이 지불해야 하는 금액은"+customerLee.calcPrice(price)+"원입니다.");
		
		_01_VIPCustomer customerKim = new _01_VIPCustomer(10020, "김유신", 12345);
		System.out.println(customerKim.getCustomerName()+" 님이 지불해야 하는 금액은"+customerKim.calcPrice(price)+"원입니다.");
		
		_01_Customer vc = new _01_VIPCustomer(10030, "나몰라", 2000);
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은"+vc.calcPrice(price)+"원입니다.");
		
		
	}
}
