package seunghee._Do_it_자바_완전_정복._02_자료형._02_이름_짓기.ex02;

public class RangeOfVariableUse {
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }

        System.out.println(value1);
        // System.out.println(value2);  // 오류
    }
}
