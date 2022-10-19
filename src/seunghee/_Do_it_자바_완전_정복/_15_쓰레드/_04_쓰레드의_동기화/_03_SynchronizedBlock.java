package seunghee._Do_it_자바_완전_정복._15_쓰레드._04_쓰레드의_동기화;

// 공유 객체
class _03_MyData {
    int data = 3;
    public void plusData() {
        synchronized (this) {
            int myData = data;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            data = myData + 1;
        }
    }
}

// 공유 객체를 사용하는 쓰레드
class _03_PlusThread extends Thread {
    _03_MyData myData;
    public _03_PlusThread(_03_MyData myData) {
        this.myData = myData;
    }
    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName() + "실행 결과 : " + myData.data);
    }
}

public class _03_SynchronizedBlock {
    public static void main(String[] args) {
        // 공유 객체 생성
        _03_MyData myData = new _03_MyData();

        // plusThread 1
        Thread plusThread1 = new _03_PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {

        }

        // plusThread 2
        Thread plusThread2 = new _03_PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
