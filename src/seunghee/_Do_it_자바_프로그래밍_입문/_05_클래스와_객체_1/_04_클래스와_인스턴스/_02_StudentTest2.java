package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._04_클래스와_인스턴스;

public class _02_StudentTest2 {
	public static void main(String[] args) {
		_01_Student student1 = new _01_Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		_01_Student student2 = new _01_Student();
		student2.studentName = "안연수";
		System.out.println(student2.getStudentName());
	}
}
