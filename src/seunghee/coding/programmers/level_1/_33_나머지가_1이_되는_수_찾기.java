package seunghee.coding.programmers.level_1;
/*
 * 자연수 n이 매개변수로 주어집니다.
 * n을 x로 나눈 나머지가 1이 되도록 하는
 * 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 */
public class _33_나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {

        // 입력
        print(solution(10));
        print(solution(12));
    }

    // 연산
    public static int solution(int num) {
        for(int i=1; i<=num; i++) {
            if(num % i == 1) {
                return i;
            }
        }
        System.out.println(9%1);
        return num ;
    }

    // 출력
    public static void print(int x) {
        System.out.println(x);
    }
}
