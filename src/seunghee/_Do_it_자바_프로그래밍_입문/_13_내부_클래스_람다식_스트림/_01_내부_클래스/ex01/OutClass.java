package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스.ex01;

public class OutClass {
    private int num = 10;
    private static int sNum = 20;

    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    class InClass {
        int inNum = 100;
        // static int sInNum = 200;
        
        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }

        // static void sTest() {
        // }
    }

    public void usingClass() {
        inClass.inTest();
    }
}
