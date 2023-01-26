package seunghee._혼자_공부하는_자바._06_클래스._05_인스턴스_멤버와_정적_멤버.ex05;

public class Person {
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
