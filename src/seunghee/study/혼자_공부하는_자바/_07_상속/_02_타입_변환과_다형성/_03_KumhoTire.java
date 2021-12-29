package seunghee.study.혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;

public class _03_KumhoTire extends _03_Tire{
	// 필드
	
	// 생성자
	public _03_KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" KumhoTire 수명: "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			return false;
		}
	}
}
