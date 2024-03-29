package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태.ex03;

class Mythread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(" -- sleep() 진행 중 interrupt() 발생");
            for(long i=0; i<100000000L; i++) {} // 시간 지연
        }
    }
}

public class TimedWaiting_Sleep {
    public static void main(String[] args) {
        Mythread myThread =  new Mythread();
        myThread.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        System.out.println("MyThread State = " + myThread.getState());

        // TIMED_WAITING
        myThread.interrupt();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) { }
        System.out.println("MyThread State = " + myThread.getState());
    }
}
