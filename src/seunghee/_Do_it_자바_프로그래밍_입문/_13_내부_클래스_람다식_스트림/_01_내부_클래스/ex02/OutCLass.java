package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스.ex02;

public class OutCLass {
    private int num = 10;
    private static int sNum = 20;

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            // num += 10;
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        static void sTest() {
            // num += 10;
            // inNum += 10;
            System.out.println("OutCLass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
            System.out.println("InStaticCLass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
        }
    }
}
