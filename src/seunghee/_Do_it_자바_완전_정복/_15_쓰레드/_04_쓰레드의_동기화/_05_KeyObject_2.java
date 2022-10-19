package seunghee._Do_it_자바_완전_정복._15_쓰레드._04_쓰레드의_동기화;

class _05_MyData {
    synchronized void abc() {
        for(int i = 0; i < 3; i++) {
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
        synchronized(new Object()) {
            for(int i=0; i<3; i++) {
                System.out.println(i + "번째");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {

                }
            }
        }
    }
}


public class _05_KeyObject_2 {
    public static void main(String[] args) {
        // 공유 객체
        _05_MyData mydata = new _05_MyData();

        // 3개의 쓰레드가 각각의 메서드 호출
        new Thread() {
            public void run() {
                mydata.abc();
            }
        }.start();
        new Thread() {
            public void run() {
                mydata.bcd();
            }
        }.start();
        new Thread() {
            public void run() {
                mydata.cde();
            }
        }.start();
    }
}
