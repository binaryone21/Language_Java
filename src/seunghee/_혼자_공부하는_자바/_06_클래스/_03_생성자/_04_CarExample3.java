package seunghee._혼자_공부하는_자바._06_클래스._03_생성자;

public class _04_CarExample3 {
	public static void main(String[] args) {
		_04_Car3 car1 = new _04_Car3();
		System.out.println("car1.company : "+car1.company);
		System.out.println();
		
		_04_Car3 car2 = new _04_Car3("자가용");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);
		System.out.println();
		
		_04_Car3 car3 = new _04_Car3("자가용", "빨강");
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println();
		
		_04_Car3 car4 = new _04_Car3("택시", "검정", 200);
		System.out.println("car4.company : "+car4.company);
		System.out.println("car4.model : "+car4.model);
		System.out.println("car4.color : "+car4.color);
		System.out.println("car4.maxSpeed : "+car4.maxSpeed);
	}
}
