package seunghee.coding.programmers.level_0.ex011_ex020;

/*
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%,
 * 30만 원 이상 사면 10%,
 * 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때,
 * 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 */
public class ex_019_옷가게_할인_받기 {
	// 입력
	public static void main(String[] args) {
		print(solution(150000));		// 142500
		print(solution(580000));		// 464000
	}
	// 연산
	public static int solution(int price) {
		if(price >= 500000) {
			return (int)(0.8 * price);
		} else if(price >= 300000) {
			return (int)(0.9 * price);
		} else if(price >= 100000) {
			return (int)(0.95 * price);
		} else {
			return price;
		}
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
