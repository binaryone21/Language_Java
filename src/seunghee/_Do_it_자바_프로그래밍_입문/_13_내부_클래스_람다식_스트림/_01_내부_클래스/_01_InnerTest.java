package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스;

public class _01_InnerTest {
    public static void main(String[] args) {
        _01_OutClass outClass = new _01_OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass();
    }
}
