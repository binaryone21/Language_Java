package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _05_PersonExample {
	public static void main(String[] args) {
		_05_Person p1 = new _05_Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
	}
}
