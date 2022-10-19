package seunghee._Do_it_자바_완전_정복._15_쓰레드._04_쓰레드의_동기화;

class _04_MyData {
    synchronized void abc() {
        for(int i=0; i<3; i++) {
            System.out.println(i + "sec");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
        }
    }

    synchronized void bcd() {
        for(int i=0; i<3; i++) {
            System.out.println(i + "초");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {

            }
        }
    }

    void cde() {
        synchronized (this) {
            for(int i=0; i<3; i++) {
                System.out.println(i + "번째");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}

public class _04_KeyObject_1 {
    public static void main(String[] args) {
        // 공유 객체
        _04_MyData myData = new _04_MyData();

        // 3개의 쓰레드가 각각의 메서드 호출
        new Thread() {
            public void run() {
                myData.abc();
            }
        }.start();
        new Thread() {
            public void run() {
                myData.bcd();
            }
        }.start();
        new Thread() {
            public void run() {
                myData.cde();
            }
        }.start();
    }
}
