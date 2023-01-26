package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식.ex06;

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = returnString();
        lambdaStr.showString("hello");
    }
    public static PrintString returnString() {
        return s -> System.out.println(s + ", lambda");
    }
}
