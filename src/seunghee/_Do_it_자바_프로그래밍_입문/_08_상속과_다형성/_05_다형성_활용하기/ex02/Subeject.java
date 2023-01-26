package seunghee._Do_it_자바_프로그래밍_입문._08_상속과_다형성._05_다형성_활용하기.ex02;

public class Subeject {
	private int subjectId;
	private int subjectName;
	
	public int getSubjeftId() {
		return subjectId;
	}
	
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	
	public int getSubjectName() {
		return subjectName;
	}
	
	public void setSubjectName(int subjectName) {
		this.subjectName = subjectName;
	}
	
	public void showSubjectInfo() {
		System.out.println(subjectId+", "+subjectName);
	}
}
