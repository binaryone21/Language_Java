package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._03_메서드_오버라이딩;

public class _01_OverridingTest {
	public static void main(String[] args) {
		_01_Customer vc = new _01_VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		int price = 10000;
		System.out.println(vc.getCustomerName()+" 님이 지불해야 하는 금액은 "+vc.calcPrice(price)+"원입니다.");
	}
}
