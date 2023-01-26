package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스.ex02;

public class StaticInnerTest {
    public static void main(String[] args) {
        OutCLass.InStaticClass sInClass = new OutCLass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();

        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutCLass.InStaticClass.sTest();
    }
}
