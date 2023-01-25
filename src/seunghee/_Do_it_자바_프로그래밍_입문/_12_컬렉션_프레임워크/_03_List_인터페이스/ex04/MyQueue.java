package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스.ex04;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }

    public String deQueue() {
        int len = arrayQueue.size();
        if(len == 0) {
            System.out.println("큐가 비어있습니다.");
            return null;
        }
        return arrayQueue.remove(0);
    }
}
