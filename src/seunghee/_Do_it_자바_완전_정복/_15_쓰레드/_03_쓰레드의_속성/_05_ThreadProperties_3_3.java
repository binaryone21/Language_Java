package seunghee._Do_it_자바_완전_정복._15_쓰레드._03_쓰레드의_속성;

class _05_MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + ": " + (isDaemon() ? "데몬 쓰레드" : "일반 쓰레드"));
        for(int i=0; i<6; i++) {
            System.out.println(getName() + ": " + i + "초");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class _05_ThreadProperties_3_3 {
    public static void main(String[] args) {

        // 일반 쓰레드
        Thread thread1 = new _05_MyThread();
        thread1.setDaemon(false);
        thread1.setName("thread1");
        thread1.start();

        // 데몬 쓰레드
        Thread thread2 = new _05_MyThread();
        thread2.setDaemon(true);
        thread2.setName("thread2");
        thread2.start();

        // 3.5초후 main 쓰레드 종료
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {

        }
        System.out.println("main Thread 종료");
    }
}
