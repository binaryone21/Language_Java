package seunghee.study.Do_It_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스;

import java.util.ArrayList;

public class _03_StackTest {
    public static void main(String[] args) {
        _03_MyStack stack = new _03_MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
