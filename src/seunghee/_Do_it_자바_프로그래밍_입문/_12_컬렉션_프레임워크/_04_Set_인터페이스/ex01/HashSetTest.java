package seunghee._Do_it_자바_프로그래밍_입문._12_컬렉션_프레임워크._04_Set_인터페이스.ex01;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("임정순"));
        hashSet.add(new String("박현정"));
        hashSet.add(new String("홍연의"));
        hashSet.add(new String("강감찬"));
        hashSet.add(new String("강감찬"));

        System.out.println(hashSet);
    }
}
