package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

public class _05_Member {
	public String name;
	public int age;
	
	public _05_Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _05_Member) {
			_05_Member member = (_05_Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
