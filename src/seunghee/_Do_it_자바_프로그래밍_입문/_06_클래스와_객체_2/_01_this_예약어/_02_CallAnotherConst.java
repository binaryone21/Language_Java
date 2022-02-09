package seunghee._Do_it_자바_프로그래밍_입문._06_클래스와_객체_2._01_this_예약어;

public class _02_CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}
}

class Person {
	String name;
	int age;
	
	Person() {
		this("이름 없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}
}