package seunghee.coding.programmers.level1;

import java.util.Arrays;
/*
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다.
 * 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와
 * 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 */
public class _45_완주하지_못한_선수 {
    public static void main(String[] args) {
        // 입력
        print(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        print(solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}));
        print(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }

    // 연산
    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }

        return participant[participant.length-1];
    }

    // 출력
    public static void print(String answer) {
        System.out.println(answer);
    }
}
