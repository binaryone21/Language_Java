package seunghee.coding.programmers.level1;

public class _32_부족한_금액_계산 {
    public static void main(String[] args) {
        
        // 입력
        print(solution(3, 20, 4));
    }

    // 연산
    public static int solution(int price, int money, int count) {
        for(int i=1; i<=count; i++) {
            money -= price * i;
        }

        return money;
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}