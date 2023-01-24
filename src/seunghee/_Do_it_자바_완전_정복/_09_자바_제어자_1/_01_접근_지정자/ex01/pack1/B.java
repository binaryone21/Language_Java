package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack1;

public class B {
    public void print() {
        // 객체 생성
        A a = new A();

        // 멤버 활용
        System.out.print(a.a + " ");
        System.out.print(a.b + " ");
        System.out.print(a.c + " ");
        // System.out.print(a.d + " ");
        System.out.println();
    }
}
