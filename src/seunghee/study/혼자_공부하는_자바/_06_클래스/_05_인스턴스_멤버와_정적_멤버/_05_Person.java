package seunghee.study.혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버;

public class _05_Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public _05_Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
