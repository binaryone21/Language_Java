package seunghee.coding.programmers.level_0_5;

/*
 * 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
 * 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때,
 * 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
 */

public class _61_9로_나눈_나머지 {
	// 입력
	public static void main(String[] args) {
		print(solution("123")); 					// 6
		print(solution("78720646226947352489")); 	// 2
	}

	// 연산
	public static int solution(String number) {
		String[] split = number.split("");
		int num = 0;
		for(String str : split) {
			num += Integer.parseInt(str);
		}
		while(num > 9) {
			num = num/10 + num%10;
		}
		return num%9;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
