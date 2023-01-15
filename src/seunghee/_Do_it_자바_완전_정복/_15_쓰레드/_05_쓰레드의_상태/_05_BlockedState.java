package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태;

class _05_MyBlockTest {
    // 공유 객체
    _05_MyClass mc = new _05_MyClass();

    // 3개의 쓰레드 필드 생성
    Thread t1 = new Thread("thread1") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t2 = new Thread("thread2") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t3 = new Thread("thread3") {
        public void run() {
            mc.syncMethod();
        }
    };

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    class _05_MyClass {
        synchronized void syncMethod() {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {

            }
            System.out.println("===" + Thread.currentThread().getName() + "===");
            System.out.println("thread1 -> " + t1.getState());
            System.out.println("thread2 -> " + t2.getState());
            System.out.println("thread3 -> " + t3.getState());
            for(long i=0; i<100000000L; i++) {}       // 시간 지연
        }
    }
}

public class _05_BlockedState {
    public static void main(String[] args) {
        _05_MyBlockTest mbt = new _05_MyBlockTest();
        mbt.startAll();
    }
}
