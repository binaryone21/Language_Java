package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._02_메서드;

public class _04_EffectOfPrimaryDataArgument {
    public static void main(String[] args) {
        int a = 3;
        int result1 = twice(3);
        System.out.println(result1);
        int result2 = twice(a);
        System.out.println(result2);
        System.out.println(a);
    }
    public static int twice(int a) {
        a = a * 2;
        return a;
    }
}
