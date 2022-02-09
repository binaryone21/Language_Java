package seunghee._혼자_공부하는_자바._13_컬렉션_프레임워크._01_컬렉션_프레임워크;

public class _07_Student {
	public int sno;
	public String name;
	
	public _07_Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof _07_Student) {
			_07_Student student = (_07_Student) obj;
			return (sno == student.sno)&& (name.equals(student.name)); 
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sno + name.hashCode();
	}
}
