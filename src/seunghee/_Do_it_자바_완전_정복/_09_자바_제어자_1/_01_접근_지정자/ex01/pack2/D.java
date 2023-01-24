package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack2;

import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack1.A;

public class D extends A {
    public void print() {
        // 멤버 활용
        System.out.print(a + " ");
        System.out.print(b + " ");
        // System.out.print(c + " ");
        // System.out.print(d + " ");
        System.out.println();
    }
}
