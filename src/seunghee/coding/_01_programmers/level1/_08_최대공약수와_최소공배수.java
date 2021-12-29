package seunghee.coding._01_programmers.level1;
/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
 * solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로
 * solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */
public class _08_최대공약수와_최소공배수 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(3, 12));
		print(solution(2, 5));
	}

	// 연산
	public static int[] solution(int num1, int num2) {
        int[] answer = new int[2];
        
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 > num2) ? num2 : num1;
        
        for(int i=1; i<=min; i++) {
            if((max%i == 0)&&(min%i == 0)) {
                answer[0] = i;
            }
        }
        for(int i=max; i<=min*max; i++) {
            if((i%min == 0) && (i%max == 0)) {
                answer[1] = i;
                break;
            }
        }
        return answer;
	}
	
	// 출력
	public static void print(int[] answer) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(answer[0]);
		sb.append(", ");
		sb.append(answer[1]);
		sb.append("]");
		System.out.println(sb.toString());
	}
}
