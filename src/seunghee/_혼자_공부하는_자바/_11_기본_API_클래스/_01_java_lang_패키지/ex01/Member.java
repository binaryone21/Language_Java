package seunghee._혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지.ex01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id )) {
				return true;
			}
		}
		return false;
	}
}
