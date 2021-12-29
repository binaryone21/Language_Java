package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

public class _01_Member {
	public String id;
	
	public _01_Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof _01_Member) {
			_01_Member member = (_01_Member) obj;
			if(id.equals(member.id )) {
				return true;
			}
		}
		return false;
	}
}
