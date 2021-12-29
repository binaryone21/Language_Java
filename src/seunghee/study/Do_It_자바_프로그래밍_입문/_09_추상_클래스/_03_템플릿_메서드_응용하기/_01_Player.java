package seunghee.study.Do_It_자바_프로그래밍_입문._09_추상_클래스._03_템플릿_메서드_응용하기;

public class _01_Player {
	private _01_PlayerLevel level;
	
	public _01_Player() {
		level = new _01_BeginnerLevel();
		level.showLevelMessage();
	}
	
	public _01_PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(_01_PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
