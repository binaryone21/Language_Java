package seunghee.coding.programmers.level_0.ex011_ex020;

import java.util.*;

/*
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때,
 * 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 */
public class ex_013_최빈값_구하기 {
	// 입력
	public static void main(String[] args) {
		print(solution(new int[] {1, 2, 3, 3, 3, 4}));		// 3
		print(solution(new int[] {1, 1, 2, 2}));			// -1
		print(solution(new int[] {1}));						// 1
	}

	// 연산
	public static int solution(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : array) {
			if(!map.containsKey(i)) {
				map.put(i, 0);
			}
			map.put(i, map.get(i)+1);
		}
		if(map.size() == 1) {
			return array[0];
		}
		List<Integer> keySet = new ArrayList<>(map.keySet());
		keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
		return map.get(keySet.get(0)) != map.get(keySet.get(1)) ? keySet.get(0) : -1;
	}

	// 출력
	public static void print(int answer) {
		System.out.println(answer);
	}
}
