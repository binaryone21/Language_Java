package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._05_생성자;

public class _02_Person2 {
	String name;
	float height;
	float weight;
	
	public _02_Person2() { }
	
	public _02_Person2(String pname) {
		name = pname;
	}
	
	public _02_Person2(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
