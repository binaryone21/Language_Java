package seunghee.coding.programmers.level_1;

import java.util.ArrayList;
/*
 * 주어진 숫자 중 3개의 수를 더했을 때
 * 소수가 되는 경우의 개수를 구하려고 합니다.
 * 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
 * nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
 * 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
 */
public class _46_소수_만들기 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {1, 2, 3, 4}));
        print(solution(new int[] {1, 2, 7, 6, 4}));
    }

    // 연산
    public static int solution(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        int count = 0;
        for(int num : list) {
            boolean isOk = true;
            for(int i=2; i<=Math.sqrt(num); i++) {
                if(num%i == 0) {
                    isOk = false;
                    break;
                }
            }
            if(isOk) {
                count++;
            }
        }

        return count;
    }

    // 출력
    public static void print(int answer) {
        System.out.println(answer);
    }
}
