package seunghee._혼자_공부하는_자바._06_클래스._01_객체_지향_프로그래밍.ex01;


public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른  Student 객체를 참조합니다.");
	}
}
