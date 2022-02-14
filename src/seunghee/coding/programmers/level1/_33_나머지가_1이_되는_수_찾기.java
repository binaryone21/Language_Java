package seunghee.coding.programmers.level1;

public class _33_나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {

        // 입력
        print(solution(10));
        print(solution(12));
    }

    // 연산
    public static int solution(int num) {
        for(int i=1; i<=num/2; i++) {
            System.out.println(i);
            if(num % i == 1) {
                return i;
            }
        }
        System.out.println(9%1);
        return num;
    }

    // 출력
    public static void print(int x) {
        System.out.println(x);
    }
}
