package seunghee._Do_it_자바_완전_정복._04_제어문과_제어_키워드._01_제어문.ex02;

public class SwitchControlStatement {
	public static void main(String[] args) {
		// break가 포함되지 않았을 때
		int value1 = 2;
		switch(value1) {
			case 1 :
				System.out.println("A");
			case 2 :
				System.out.println("B");
			case 3 :
				System.out.println("C");
			case 4 :
				System.out.println("D");
		}
		System.out.println();

		// break가 포함돼 있을 때
		int value2 = 2;
		switch(value2) {
			case 1 :
				System.out.println("A");
				break;
			case 2 :
				System.out.println("B");
				break;
			case 3 :
				System.out.println("C");
				break;
			case 4 :
				System.out.println("D");
		}
		System.out.println();

		// if - else if - else 구문으로 변환
		if(value1 == 1) {
			System.out.println("A");
		} else if(value1 == 2) {
			System.out.println("B");
		} else if(value1 == 3) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}