package seunghee.coding.programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 수포자는 수학을 포기한 사람의 준말입니다.
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 * 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
 * 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아
 * return 하도록 solution 함수를 작성해주세요.
*/
public class _43_모의고사 {
    public static void main(String[] args) {
        // 입력
        print(solution(new int[] {1, 2, 3, 4, 5}));
        print(solution(new int[] {1, 3, 2, 4, 2}));
    }

    // 연산
    public static int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        for(int i=0, i1=0, i2=0, i3=0; i<answers.length; i++, i1++, i2++, i3++) {
            i1 = i1%person1.length;
            i2 = i2%person2.length;
            i3 = i3%person3.length;

            if(answers[i] == person1[i1]) { map.put(1, map.get(1)+1); }
            if(answers[i] == person2[i2]) { map.put(2, map.get(2)+1); }
            if(answers[i] == person3[i3]) { map.put(3, map.get(3)+1); }
        }

        for(int i=1; i<=3; i++) {
            if(map.get(i) == 0) {
                map.remove(i);
            }
        }

        List<Integer> list = new ArrayList<>(map.values());
        list.stream().sorted();
        int[] answer = new int[3];
        for(int i=0; i<list.size(); i++) {
            for(int j=1; j<=3; j++) {
                if(list.get(i) == map.get(j)) {
                    answer[i]=j;
                }
            }
        }

        return answer;
    }

    // 출력
    public static void print(int[] answer) {
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i]);
        }
        System.out.println();
    }
}
