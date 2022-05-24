package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.pack1;

public class _01_A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d);
        System.out.println();
    }
}
