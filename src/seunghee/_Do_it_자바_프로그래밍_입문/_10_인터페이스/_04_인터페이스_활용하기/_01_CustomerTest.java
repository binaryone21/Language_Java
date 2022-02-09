package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _01_CustomerTest {
	public static void main(String[] args) {
		_01_Customer customer = new _01_Customer();
		
		_01_Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		_01_Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof _01_Customer) {
			_01_Customer customer2 = (_01_Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}
}
