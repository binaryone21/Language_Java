package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._02_람다식;

public class _01_TestMyNumber {
    public static void main(String[] args) {
        _01_MyNumber max = (_01_MyNumber) (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 20));
    }
}
