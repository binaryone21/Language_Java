package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._01_필드.ex02;

public class InitialValueOfFiledAndLocalVariable {
    public static void main(String[] args) {
        // 클래스를 활용해 객체 생성
        A a = new A();
        // 객체 활용
        a.printFieldValue();
    }
}

class A {
    boolean m1;
    int m2;
    double m3;
    String m4;
    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }
    void printLocalVariable() {
        int k;
        // System.out.println(k);
    }
}
