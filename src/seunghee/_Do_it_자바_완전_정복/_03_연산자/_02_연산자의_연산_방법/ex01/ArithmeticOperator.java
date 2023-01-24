package seunghee._Do_it_자바_완전_정복._03_연산자._02_연산자의_연산_방법.ex01;

public class ArithmeticOperator {
    public static void main(String[] args) {
        // 산술 연산자
        System.out.println(2 + 3);
        System.out.println(8 - 5);
        System.out.println(7 * 2);
        System.out.println(7 / 2);
        System.out.println(8 % 5);
        System.out.println();

        // 증감 연산자 @case1
        int value1 = 3;
        value1++;
        System.out.println(value1);
        int value2 = 3;
        ++value2;
        System.out.println(value2);
        System.out.println();

        // 증갑 연산자 @case2
        int value3 = 3;
        int value4 = value3++;
        System.out.println(value3);
        System.out.println(value4);
        System.out.println();

        int value5 = 3;
        int value6 = ++value5;
        System.out.println(value5);
        System.out.println(value6);
        System.out.println();

        // 증감 연산자 @case3
        int value7 = 3;
        int value8 = 4;
        int value9 = 2 + value7-- + ++value8;
        System.out.println(value7);
        System.out.println(value8);
        System.out.println(value9);
    }
}
