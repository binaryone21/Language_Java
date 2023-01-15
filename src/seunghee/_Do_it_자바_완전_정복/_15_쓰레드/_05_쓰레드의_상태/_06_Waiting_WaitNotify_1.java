package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태;

class _06_DataBox {
    int data;
    synchronized void inputData(int data) {
        this.data = data;
        System.out.println("입력 데이터 : " + data);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    synchronized void outputData() {
        System.out.println("출력 데이터 : " + data);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class _06_Waiting_WaitNotify_1 {
    public static void main(String[] args) {
        _06_DataBox dataBox = new _06_DataBox();
        Thread t1 = new Thread() {
            public void run() {
                for(int i=1; i<9; i++) {
                    dataBox.inputData(i);
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for(int i=1; i<9; i++) {
                    dataBox.outputData();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
