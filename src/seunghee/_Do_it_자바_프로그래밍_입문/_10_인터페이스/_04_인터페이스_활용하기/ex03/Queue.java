package seunghee._Do_it_자바_프로그래밍_입문._10_인터페이스._04_인터페이스_활용하기.ex03;

public interface Queue {
	void enQueue(String title);
	String deQueue();
	int getSize();
}
