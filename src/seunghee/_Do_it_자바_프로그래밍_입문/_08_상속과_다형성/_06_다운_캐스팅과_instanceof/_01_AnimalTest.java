package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._06_다운_캐스팅과_instanceof;

import java.util.ArrayList;

public class _01_AnimalTest {
	public static void main(String[] args) {
		ArrayList<_01_Animal> aniList = new ArrayList<_01_Animal>();
		_01_AnimalTest aTest = new _01_AnimalTest();
		aTest.addAnimal(aniList);
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting(aniList);
	}
	
	public void addAnimal(ArrayList<_01_Animal> aniList) {
		aniList.add(new _01_Human());
		aniList.add(new _01_Tiger());
		aniList.add(new _01_Eagle());
		
		for(_01_Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting(ArrayList<_01_Animal> aniList) {
		for(int i=0; i<aniList.size(); i++) {
			_01_Animal ani = aniList.get(i);
			if(ani instanceof _01_Human) {
				_01_Human h = (_01_Human) ani;
				h.readBook();
			} else if(ani instanceof _01_Tiger) {
				_01_Tiger t = (_01_Tiger) ani;
				t.hunting();
			} else if(ani instanceof _01_Eagle) {
				_01_Eagle e = (_01_Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}
