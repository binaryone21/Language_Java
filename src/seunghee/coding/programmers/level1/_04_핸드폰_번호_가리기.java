package seunghee.coding.programmers.level1;
/*
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
 * 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때,
 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를
 * 전부 *으로 가린 문자열을 리턴하는 함수,
 * solution을 완성해주세요.
 */
public class _04_핸드폰_번호_가리기 {

	// 입력
	public static void main(String[] args) {
		print(solution("01033334444"));
		print(solution("0277778888"));
	}
	
	// 연산
	public static String solution(String phone_number) {
		String str1 = phone_number.substring(0, phone_number.length()-4);
		String str2 = phone_number.substring(phone_number.length()-4, phone_number.length());

		str1 = str1.replaceAll("[0-9]", "*");
		
		String answer = str1 + str2;
		return answer;
	}
	
	// 출력
	public static void print(String answer) {
		System.out.println(answer);
	}
}

