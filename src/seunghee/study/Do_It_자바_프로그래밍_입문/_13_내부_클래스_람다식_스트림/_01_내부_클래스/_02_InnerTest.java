package seunghee.study.Do_It_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스;

public class _02_InnerTest {
    public static void main(String[] args) {
        _02_OutCLass.InStaticClass sInClass = new _02_OutCLass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();

        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        _02_OutCLass.InStaticClass.sTest();
    }
}
