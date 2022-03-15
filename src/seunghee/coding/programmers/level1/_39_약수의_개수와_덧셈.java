package seunghee.coding.programmers.level1;
/*
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서,
 * 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록
 * solution 함수를 완성해주세요.
 */
public class _39_약수의_개수와_덧셈 {
    public static void main(String[] args) {
        // 입력
        print(solution(13, 17));
        print(solution(24, 27));
    }

    // 연산
    public static int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {
            int check = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    check++;
                }
            }

            if(check%2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}
