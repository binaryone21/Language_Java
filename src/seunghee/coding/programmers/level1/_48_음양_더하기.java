package seunghee.coding.programmers.level1;
/*
 * 어떤 정수들이 있습니다.
 * 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와
 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다.
 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 */
public class _48_음양_더하기 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {4, 7, 12}, new boolean[] {true, false, true}));
        print(solution(new int[] {1, 2, 3}, new boolean[] {false, false, true}));
    }

    // 연산
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for(int i=0; i<absolutes.length; i++) {
            if(signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }
        return sum;
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}
