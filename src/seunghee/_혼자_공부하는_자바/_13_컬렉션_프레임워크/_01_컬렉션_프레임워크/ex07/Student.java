package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크.ex07;

public class Student {
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno)&& (name.equals(student.name)); 
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
