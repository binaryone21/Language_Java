package seunghee.coding.programmers.level1;

import java.util.HashSet;

public class _41_포켓몬 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {3, 1, 2, 3}));
        print(solution(new int[] {3, 3, 3, 2, 2, 4}));
        print(solution(new int[] {3, 3, 3, 2, 2, 2}));
    }

    // 연산
    public static int solution(int[] nums) {
        HashSet set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        return Math.min(set.size(), nums.length/2);
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}