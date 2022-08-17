package seunghee._Do_it_자바_완전_정복._15_쓰레드._03_쓰레드의_속성;

// 우선순위
class _02_MyThread extends Thread {
    @Override
    public void run() {
        for(long i=0; i<100000000; i++) {}  // 시간 지연용
        System.out.println(getName() + " 우선순위 : " + getPriority());
    }
}

public class _02_ThreadProperties_2 {
    public static void main(String[] args) {
        // CPU 코어 수
        System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());

        // 우선순위 자동 지정
        for(int i=0; i<3; i++) {
            Thread thread = new _02_MyThread();
            thread.start();
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        // 우선순위 직접 지정
        for(int i=0; i<10; i++) {
            Thread thread = new _02_MyThread();
            thread.setName(i + "번째 쓰레드");
            if(i==9) {
                thread.setPriority(10);
            }
            thread.start();
        }
    }
}
