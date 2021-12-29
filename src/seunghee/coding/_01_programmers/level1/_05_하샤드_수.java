package seunghee.coding._01_programmers.level1;
/*
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
 * 예를 들어 18의 자릿수 합은 1+8=9이고,
 * 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수,
 * solution을 완성해주세요.
 */
public class _05_하샤드_수 {
	public static void main(String[] args) {

		// 입력
		print(solution(10));
		print(solution(12));
		print(solution(11));
		print(solution(13));
	}

	// 연산
    public static boolean solution(int num) {
        boolean answer = false;
        
        int i = num;
        int sum = 0;
        while(num != 0) {
        	sum += i%10;
        	i /= 10;
        }
        
        if(num%sum == 0) {
        	answer = true; 
        }
        
        return answer;
    }

    // 출력
	public static void print(boolean answer) {
		System.out.println(answer);
	}
}