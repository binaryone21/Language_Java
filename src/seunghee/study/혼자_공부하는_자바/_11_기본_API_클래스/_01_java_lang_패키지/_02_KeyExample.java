package seunghee.study.혼자_공부하는_자바._11_기본_API_클래스._01_java_lang_패키지;

import java.util.HashMap;

public class _02_KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<_02_Key, String> hashMap = new HashMap<_02_Key, String>();
		
		// 식별키 new Key(1)로 "홍길동"을 저장함
		hashMap.put(new _02_Key(1), "홍길동");
		
		// 식별키 new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new _02_Key(1));
		System.out.println(value);
	}
}
