package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식.ex05;

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        showString(lambdaStr);
    }
    public static void showString(PrintString lambdaStr) {
        lambdaStr.showString("hello, lambda");
    }
}
