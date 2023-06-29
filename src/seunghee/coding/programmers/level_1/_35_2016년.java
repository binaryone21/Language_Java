package seunghee.coding.programmers.level_1;

import java.util.Calendar;
/*
 * 2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요?
 * 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수,
 * solution을 완성하세요.
 *
 * 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT 입니다.
 * 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
 */
public class _35_2016년 {
    public static void main(String[] args) {

        // 입력
        print(solution(5, 24));
    }

    // 연산
    public static String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar today = Calendar.getInstance();
        today.set(2016, a-1, b);
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        return week[today.get(Calendar.DAY_OF_WEEK) - 1];
    }

    // 출력
    public static void print(String answer) {
        System.out.println(answer);
    }
}
