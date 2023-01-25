package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._06_다운_캐스팅과_instanceof.ex01;

public class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
