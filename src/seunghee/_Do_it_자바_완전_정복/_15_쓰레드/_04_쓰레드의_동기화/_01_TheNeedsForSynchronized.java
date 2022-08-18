package seunghee._Do_it_자바_완전_정복._15_쓰레드._04_쓰레드의_동기화;

// 공유 객체
class _01_MyData {
    int data = 3;
    public void plusData() {
        int myData = data;  // 데이터 가져오기
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        data = myData + 1;
    }
}

// 공유 객체를 사용하는 쓰레드
class _01_PlusThread extends Thread {
    _01_MyData myData;
    public _01_PlusThread(_01_MyData myData) {
        this.myData = myData;
    }
    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName() + "실행 결과 : " + myData.data);
    }
}

public class _01_TheNeedsForSynchronized {
    public static void main(String[] args) {
        // 공유 객체 생성
        _01_MyData myData = new _01_MyData();

        // plusThread 1
        Thread plusThread1 = new _01_PlusThread(myData);
        plusThread1.setName("plusThread1");
        plusThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        // plusThread 2
        Thread plusThread2 = new _01_PlusThread(myData);
        plusThread2.setName("plusThread2");
        plusThread2.start();
    }
}
