package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._05_생성자.ex02;

public class Person2 {
	String name;
	float height;
	float weight;
	
	public Person2() { }
	
	public Person2(String pname) {
		name = pname;
	}
	
	public Person2(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
