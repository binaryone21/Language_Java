package seunghee.study.Do_It_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기;

public class _03_BookShelf extends _03_Shelf implements _03_Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}
}
