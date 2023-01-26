package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._05_static_응용_싱글톤_패턴.ex01;

public class CompanyTest {
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
	}
}
