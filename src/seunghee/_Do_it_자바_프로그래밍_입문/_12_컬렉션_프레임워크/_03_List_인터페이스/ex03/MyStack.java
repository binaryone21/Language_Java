package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스.ex03;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        int len = arrayStack.size();
        if(len == 0) {
            System.out.println("스택이 비어있습니다.");
            return null;
        }
        return (arrayStack.remove(len-1));
    }
}
