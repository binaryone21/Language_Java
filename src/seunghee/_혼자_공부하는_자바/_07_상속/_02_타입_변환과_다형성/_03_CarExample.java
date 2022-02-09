package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;

public class _03_CarExample {
	public static void main(String[] args) {
		_03_Car car = new _03_Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new _03_HankookTire("앞왼쪽", 15);
					break;
				case 2 :
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new _03_KumhoTire("앞오른쪽", 13);
					break;
				case 3 :
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new _03_HankookTire("뒤왼쪽", 14);
					break;
				case 4 :
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new _03_KumhoTire("뒤오른쪽", 17);
					break;
			}
			System.out.println("--------------------------------------");
		}
	}
}
