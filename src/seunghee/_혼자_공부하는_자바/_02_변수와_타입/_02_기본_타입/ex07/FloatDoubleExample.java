package seunghee._혼자_공부하는_자바._02_변수와_타입._02_기본_타입.ex07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		
		// 실수값 저장
		float var1 /* = 3.14 */;	// 컴파일 에러
		float var2 = 3.14F;
		double var3 = 3.14;
		
		// 정밀도 테스트
		float var4 = 0.1234567890123456789F;
		double var5 = 0.1234567890123456789;
		
		System.out.println("var2 : "+var2);
		System.out.println("var3 : "+var3);
		System.out.println("var4 : "+var4);
		System.out.println("var5 : "+var5);
		
		// e 사용하기
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println("var6 : "+var6);
		System.out.println("var7 : "+var7);
		System.out.println("var8 : "+var8);
	}
}
