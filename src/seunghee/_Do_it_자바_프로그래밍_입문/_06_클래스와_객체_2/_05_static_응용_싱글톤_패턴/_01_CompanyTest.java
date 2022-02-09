package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._05_static_응용_싱글톤_패턴;

public class _01_CompanyTest {
	public static void main(String[] args) {
		_01_Company myCompany1 = _01_Company.getInstance();
		_01_Company myCompany2 = _01_Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
	}
}
