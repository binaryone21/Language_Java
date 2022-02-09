package seunghee._Do_it_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기;

public class _01_MainBoard {
	public static void main(String[] args) {
		_01_Player player = new _01_Player();
		player.play(1);
		
		_01_AdvancedLevel aLevel = new _01_AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		_01_SuperLevel sLevel = new _01_SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}
}
