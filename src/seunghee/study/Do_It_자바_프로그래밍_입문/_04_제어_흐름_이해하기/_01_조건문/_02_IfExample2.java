package seunghee.study.Do_It_자바_프로그래밍_입문._04_제어_흐름_이해하기._01_조건문;

public class _02_IfExample2 {
	public static void main(String[] args) {
		int age = 9;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("초등학생입니다.");
		} else if (age <20) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 "+charge+"원 입니다.");
	}
}
