package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기.ex01;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}
}
