package seunghee.study.Do_It_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public interface _01_Buy {
	void buy();
	
	default void order() {
		System.out.println("구매 주문");
	}
}
