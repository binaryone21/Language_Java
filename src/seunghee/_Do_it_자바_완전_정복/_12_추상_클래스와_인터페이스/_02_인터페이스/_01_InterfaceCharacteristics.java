package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _01_A {
    public static final int a = 3;
    public abstract void abc();
}

interface _01_B {
    int b = 3;      // 생략했을 때 자동으로 public static final
    void bcd();     // 생략했을 때 자동으로 public abstract
}

public class _01_InterfaceCharacteristics {
    public static void main(String[] args) {
        // static 자동 추가 확인
        System.out.println(_01_A.a);
        System.out.println(_01_B.b);

        // final 자동 추가 확인
        // _01_A.a = 5;     // 불가능
        // _01_B.b = 5;     // 불가능
    }
}
