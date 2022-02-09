package seunghee._혼자_공부하는_자바._07_상속._02_타입_변환과_다형성;

public class _03_Tire {
	// 필드
	public int maxRotation;
	public int accumulatedRotation;
	public String location;
	
	// 생성자
	public _03_Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명 : "+(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("*** " +location+" Tire 펑크 ***");
			return false;
		}
	}
}
