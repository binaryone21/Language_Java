package seunghee._Do_it_자바_완전_정복._15_쓰레드._05_쓰레드의_상태;

class _07_DataBox {
    boolean isEmpty = true;
    int data;
    synchronized void inputData(int data) {
        if(!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        this.data = data;
        isEmpty = false;
        System.out.println("입력 데이터 : " + data);
        notify();
    }
    synchronized void outputData() {
        if(isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        isEmpty = true;
        System.out.println("출력 데이터 : " + data);
        notify();
    }
}

public class _07_Waiting_WaitNotify_2 {
    public static void main(String[] args) {
        _07_DataBox dataBox = new _07_DataBox();
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
