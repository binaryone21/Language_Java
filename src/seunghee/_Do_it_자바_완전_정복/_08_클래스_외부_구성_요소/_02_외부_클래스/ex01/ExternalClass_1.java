package seunghee._Do_it_자바_완전_정복._08_클래스_외부_구성_요소._02_외부_클래스.ex01;

public class ExternalClass_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}
class A {
    int m = 3;
    int n = 4;
    void print() {
        System.out.println(m + ", " + n);
    }
}
