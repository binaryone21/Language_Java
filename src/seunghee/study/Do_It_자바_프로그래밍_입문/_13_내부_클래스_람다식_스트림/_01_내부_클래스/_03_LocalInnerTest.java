package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스;

public class _03_LocalInnerTest {
    public static void main(String[] args) {
        _03_OutClass out = new _03_OutClass();
        Runnable runner = out.getRunnable(10);
        runner.run();
    }
}
