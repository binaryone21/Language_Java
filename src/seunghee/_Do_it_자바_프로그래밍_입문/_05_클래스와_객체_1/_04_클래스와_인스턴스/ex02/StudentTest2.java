package seunghee._Do_it_자바_프로그래밍_입문._05_클래스와_객체_1._04_클래스와_인스턴스.ex02;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		System.out.println(student1.getStudentName());
		
		Student student2 = new Student();
		student2.studentName = "안연수";
		System.out.println(student2.getStudentName());
	}
}
