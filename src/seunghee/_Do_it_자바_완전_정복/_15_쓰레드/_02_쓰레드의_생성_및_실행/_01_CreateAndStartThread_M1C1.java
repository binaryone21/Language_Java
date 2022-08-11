package seunghee._Do_it_자바_완전_정복._15_쓰레드._02_쓰레드의_생성_및_실행;

// Thread 클래스를 상속해 클래스를 생성한 후 쓰레드 2개 생성

class _01_SMIFileThread extends Thread {
    @Override
    public void run() {
        // 자막 번호 하나~다섯
        String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        // 자막 번호 출력
        for(int i=0; i<strArray.length; i++) {
            System.out.println(" - (자막 번호) " + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class _01_CreateAndStartThread_M1C1 {
    public static void main(String[] args) {

        // SMIFileThread 객체 생성 및 시작
        Thread smiFileThread = new _01_SMIFileThread();
        smiFileThread.start();

        // 비디오 프레임 번호 1 ~ 5
        int[] intArrays = {1, 2, 3, 4, 5};

        // 비디오 프레임 번호 출력
        for(int i=0; i<intArrays.length; i++) {
            System.out.print("(비디오 프레임) " + intArrays[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}
