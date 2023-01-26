package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성.ex03;

public class HankookTire extends Tire {
	// 필드
	
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;
		}
	}
}

