package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex05;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 1000000 까지의 합 : "+sum);
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}
