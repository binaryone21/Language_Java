package seunghee._혼자_공부하는_자바._07_상속._01_상속.ex03;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : "+computer.areaCircle(r));
	}
}
