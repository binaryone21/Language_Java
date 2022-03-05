package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식;

public class _06_TestLambda {
    public static void main(String[] args) {
        _06_PrintString lambdaStr = returnString();
        lambdaStr.showString("hello");
    }
    public static _06_PrintString returnString() {
        return s -> System.out.println(s + ", lambda");
    }
}
