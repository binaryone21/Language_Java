package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _23_ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128 ~ 127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과 : " + (obj1 == obj2));
		System.out.println("언박싱후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128 ~ 127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과 : " + (obj3 == obj4));
		System.out.println("언박싱후 == 결과 : " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
		System.out.println();
	}
}
