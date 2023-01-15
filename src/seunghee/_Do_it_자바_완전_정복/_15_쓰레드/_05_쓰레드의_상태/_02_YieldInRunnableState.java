package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태;

class _02_MyThread extends Thread {
    boolean yieldFlag;
    @Override
    public void run() {
        while(true) {
            if(yieldFlag) {
                Thread.yield();
            } else {
                System.out.println(getName() + " 실행");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

public class _02_YieldInRunnableState {
    public static void main(String[] args) {
        _02_MyThread thread1 = new _02_MyThread();
        thread1.setName("thread1");
        thread1.yieldFlag = false;
        thread1.setDaemon(true);
        thread1.start();

        _02_MyThread thread2 = new _02_MyThread();
        thread2.setName("thread2");
        thread2.yieldFlag = true;
        thread2.setDaemon(true);
        thread2.start();

        // 6초 지연(1초마다 한 번씩 양보)
        for(int i=0; i<6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            thread1.yieldFlag = !thread1.yieldFlag;
            thread2.yieldFlag = !thread2.yieldFlag;
        }
    }
}
