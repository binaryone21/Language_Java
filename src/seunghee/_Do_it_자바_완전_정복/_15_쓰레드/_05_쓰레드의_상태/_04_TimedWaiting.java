package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태;

import com.sun.security.jgss.GSSUtil;

class _04_MyThread1 extends Thread {
    @Override
    public void run() {
        for(long i=0; i<600000000L; i++) {}     // 시간 지연
    }
}

class _04_MyThread2 extends Thread {
    _04_MyThread1 myThread1;
    public _04_MyThread2(_04_MyThread1 myThread1) {
        this.myThread1 = myThread1;
    }
    @Override
    public void run() {
        try {
            myThread1.join(3000);
        } catch (InterruptedException e) {
            System.out.println(" -- join(...) 진행 중 interrupt() 발생");
            for(long i=0; i<600000000L; i++) {}     // 시간 지연
        }
    }
}

public class _04_TimedWaiting {
    public static void main(String[] args) {
        // 객체 생성
        _04_MyThread1 myThread1 = new _04_MyThread1();
        _04_MyThread2 myThread2 = new _04_MyThread2(myThread1);
        myThread1.start();
        myThread2.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        System.out.println("MyThread1 State = " + myThread1.getState());
        System.out.println("MyThread2 State = " + myThread2.getState());

        // TIMED_WAITING
        myThread2.interrupt();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        System.out.println("MyThread1 State = " + myThread1.getState());
        System.out.println("MyThread2 State = " + myThread2.getState());
    }
}
