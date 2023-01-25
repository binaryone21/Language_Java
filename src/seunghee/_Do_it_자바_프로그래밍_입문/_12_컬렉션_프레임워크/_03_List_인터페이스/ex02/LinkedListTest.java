package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._03_List_인터페이스.ex02;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);

        myList.add(1, "D");
        System.out.println(myList);

        myList.addFirst("0");
        System.out.println(myList);

        System.out.println(myList.removeLast());
        System.out.println(myList);
    }
}
