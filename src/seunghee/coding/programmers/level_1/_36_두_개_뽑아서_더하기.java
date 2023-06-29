package seunghee.coding.programmers.level_1;

import java.util.Arrays;
import java.util.HashSet;

/*
 * 정수 배열 numbers가 주어집니다.
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아
 * 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
 * return 하도록 solution 함수를 완성해주세요.
 */
public class _36_두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {2, 1, 3, 4, 1}));
        print(solution(new int[] {5, 0, 2, 7}));
    }

    // 연산
    public static int[] solution(int[] numbers) {
        HashSet set = new HashSet<>();
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(i -> (int) i).toArray();
    }

    // 출력
    public static void print(int[] answer) {
        System.out.println(Arrays.toString(answer));
    }
}