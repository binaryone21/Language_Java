package seunghee._혼자_공부하는_자바._02_변수와_타입._01_변수.ex02;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour = 3;
		int minute = 5;
		System.out.println(hour+"시간 "+minute+"분");
		
		int totalMinute = (hour * 60) + minute;
		System.out.println("총 "+totalMinute+"분");
	}
}
