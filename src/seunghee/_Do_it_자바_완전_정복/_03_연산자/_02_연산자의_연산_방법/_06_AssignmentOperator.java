package seunghee._Do_it_자바_완전_정복._03_연산자._02_연산자의_연산_방법;

public class _06_AssignmentOperator {
    public static void main(String[] args) {
        // 대입 연산자오 축약 표현
        // @대입 연산자
        int value1 = 3;
        value1 = value1 + 3;
        System.out.println(value1);
        System.out.println();

        // @축약 표현
        int value2;
        value2 = 5; System.out.println(value2 += 2);
        value2 = 5; System.out.println(value2 -= 2);
        value2 = 5; System.out.println(value2 *= 2);
        value2 = 5; System.out.println(value2 /= 2);
        value2 = 5; System.out.println(value2 %= 2);
        value2 = 5; System.out.println(value2 |= 2);
        value2 = 5; System.out.println(value2 <<= 2);
        value2 = 5; System.out.println(value2 >>= 2);
        value2 = 5; System.out.println(value2 >>>= 2);
    }
}
