package seunghee.study.혼자_공부하는_자바._07_상속._01_상속;

public class _03_ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		_03_Calculator calculator = new _03_Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		_03_Computer computer = new _03_Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));
	}
}
