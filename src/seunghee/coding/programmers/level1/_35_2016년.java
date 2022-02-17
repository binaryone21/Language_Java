package seunghee.coding.programmers.level1;

import java.util.Calendar;

public class _35_2016년 {
    public static void main(String[] args) {

        // 입력
        print(solution(5, 24));
    }

    // 연산
    public static String solution(int a, int b) {
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        Calendar today = Calendar.getInstance();
        today.set(2016, a, b);
        System.out.println(today.get(Calendar.DAY_OF_WEEK));
        return week[today.get(Calendar.DAY_OF_WEEK)];
    }

    // 출력
    public static void print(String answer) {
        System.out.println(answer);
    }
}
