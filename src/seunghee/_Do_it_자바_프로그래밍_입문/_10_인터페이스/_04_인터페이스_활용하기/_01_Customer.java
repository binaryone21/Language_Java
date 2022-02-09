package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _01_Customer implements _01_Buy, _01_Sell {

	@Override
	public void sell() {
		System.out.println("구매하기");
	}

	@Override
	public void buy() {
		System.out.println("판매하기");
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
}
