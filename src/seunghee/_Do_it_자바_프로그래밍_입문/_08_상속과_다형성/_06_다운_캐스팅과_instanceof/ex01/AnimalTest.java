package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._06_다운_캐스팅과_instanceof.ex01;

import java.util.ArrayList;

public class AnimalTest {
	public static void main(String[] args) {
		ArrayList<Animal> aniList = new ArrayList<Animal>();
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal(aniList);
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting(aniList);
	}
	
	public void addAnimal(ArrayList<Animal> aniList) {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList) {
			ani.move();
		}
	}
	
	public void testCasting(ArrayList<Animal> aniList) {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human) ani;
				h.readBook();
			} else if(ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if(ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
}
