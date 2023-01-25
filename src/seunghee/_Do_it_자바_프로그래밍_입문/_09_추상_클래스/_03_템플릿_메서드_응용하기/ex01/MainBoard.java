package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기.ex01;

public class MainBoard {
	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
