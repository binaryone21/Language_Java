package seunghee.study.Do_It_자바_프로그래밍_입문._07_배열과_ArrayList._04_배열_응용_프로그램;

import java.util.ArrayList;

public class _01_Student {
	int studentID;
	String studentName;
	ArrayList<_01_Subject> subjectList;
	
	public _01_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<_01_Subject>();
	}

	public void addSubject(String name, int score) {
		_01_Subject subject = new _01_Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(_01_Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 "+studentName+"의 "+s.getName()+" 과목 성적은 "+s.getScorePoint()+"입니다.");
		}
		System.out.println("학생 "+studentName+"의 총점은"+total+"입니다.");
	}
}
