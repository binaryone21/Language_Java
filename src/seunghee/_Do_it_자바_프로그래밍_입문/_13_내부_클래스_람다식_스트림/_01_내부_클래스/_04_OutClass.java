package seunghee._Do_it_자바_프로그래밍_입문._13_내부_클래스_람다식_스트림._01_내부_클래스;

public class _04_OutClass {
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {
            int localNum = 10;

            @Override
            public void run() {
                // num = 200;
                // i = 100;
                System.out.println("i = " + i);
                System.out.println("num = " + num);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}
