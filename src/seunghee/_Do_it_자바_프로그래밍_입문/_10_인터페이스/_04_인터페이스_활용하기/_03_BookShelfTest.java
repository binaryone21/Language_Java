package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _03_BookShelfTest {
	public static void main(String[] args) {
		_03_Queue shelfQueue = new _03_BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
