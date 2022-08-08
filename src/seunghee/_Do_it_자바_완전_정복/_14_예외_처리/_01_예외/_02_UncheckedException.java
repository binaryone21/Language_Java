package seunghee._Do_it_자바_완전_정복._14_예외_처리._01_예외;

class _02_A {}
class _02_B extends _02_A {}

public class _02_UncheckedException {
    public static void main(String[] args) {
        // UncheckedException = RuntimeException(실행예외)

        // 1. ArithmeticException
        // System.out.println(3 / 0);

        // 2. ClassCastException
        _02_A a = new _02_A();
        // _02_B b = (_02_B)a;

        // 3. ArrayIndexOutOfBoundException
        int[] array = {1, 2, 3};
        // System.out.println(array[3]);

        // 4. NumberFormatException
        // int num = Integer.parseInt("10!");

        // 5. NullPointerException
        String str = null;
        System.out.println(str.charAt(2));
    }
}
