package seunghee._Do_it_자바_프로그래밍_입문._11_기본_클래스._01_Object_클래스;

public class _02_Student {
	int studentId;
	String studentName;
	
	public _02_Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + "," + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _02_Student) {
			_02_Student std = (_02_Student) obj;
			if(this.studentId == std.studentId) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}
