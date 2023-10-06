package seunghee.coding.programmers.level_0.ex011_ex020;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
public class ex_018_배열의_평균값 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));						// 5.5
		print(solution(new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));		// 94.0
	}
	// 연산
	public static double solution(int[] numbers) {
		double sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum/numbers.length;
	}

	// 출력
	public static void print(double answer) {
		System.out.println(answer);
	}
}
