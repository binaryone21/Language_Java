package seunghee._혼자_공부하는_자바._02_변수와_타입._02_기본_타입.ex03;


public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		long var3 /* = 10000000000000 */;	// 컴파일 에러
		long var4 = 10000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
