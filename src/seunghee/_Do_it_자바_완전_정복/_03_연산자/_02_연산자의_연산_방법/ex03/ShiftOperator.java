package seunghee._Do_it_자바_완전_정복._03_연산자._02_연산자의_연산_방법.ex03;

public class ShiftOperator {
    public static void main(String[] args) {
        // 산술 시프트
        // @ <<
        System.out.println(3 << 1);
        System.out.println(-3 << 1);
        System.out.println(3 << 2);
        System.out.println(-3 << 2);
        System.out.println();

        // @ >>
        System.out.println(5 >> 1);
        System.out.println(-5 >> 1);
        System.out.println(5 >> 2);
        System.out.println(-5 >> 2);
        System.out.println();

        // 논리 시피트(>>>)
        System.out.println(3 >>> 1);
        System.out.println(-3 >>> 31);
    }
}
