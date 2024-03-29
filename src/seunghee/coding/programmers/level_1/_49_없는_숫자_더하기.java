package seunghee.coding.programmers.level_1;
/*
 * 0부터 9까지의 숫자 중 일부가 들어있는
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아
 * 더한 수를 return 하도록 solution 함수를 완성해주세요.
 */
public class _49_없는_숫자_더하기 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {1, 2, 3, 4, 6, 7, 8, 0}));
        print(solution(new int[] {5, 8, 4, 0, 6, 7, 9}));
    }

    // 연산
    public static int solution(int[] numbers) {
        int sum = 45;
        for(int i : numbers) {
            sum -= i;
        }
        return sum;
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}
