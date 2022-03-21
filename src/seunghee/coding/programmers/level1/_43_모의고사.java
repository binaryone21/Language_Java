package seunghee.coding.programmers.level1;

import java.util.ArrayList;
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
        int[] score = new int[3];

        for(int i=0, i1=0, i2=0, i3=0; i<answers.length; i++, i1++, i2++, i3++) {
            i1 = i1%person1.length;
            i2 = i2%person2.length;
            i3 = i3%person3.length;

            if(answers[i] == person1[i1]) { score[0]++; }
            if(answers[i] == person2[i2]) { score[1]++; }
            if(answers[i] == person3[i3]) { score[2]++; }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList answer = new ArrayList();
        for(int i=0; i<3; i++) {
            if(score[i] == max) {
                answer.add(i+1);
            }
        }

        return answer.stream().mapToInt(i -> (int)i).toArray();
    }

    // 출력
    public static void print(int[] answer) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0; i<answer.length; i++) {
            sb.append(i);
            if(i!= answer.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}