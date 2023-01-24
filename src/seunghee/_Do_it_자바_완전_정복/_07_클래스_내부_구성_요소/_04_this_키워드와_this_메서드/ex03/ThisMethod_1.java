package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._04_this_키워드와_this_메서드.ex03;

public class ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        A a1 = new A();
        System.out.println();
        A a2 = new A(3);
    }
}
class A {
    A() {
        System.out.println("첫 번째 생성자");
    }
    A(int a) {
        this();
        System.out.println("두 번째 생성자");
    }
    /*
    void abc() {
        this();
    }
    */
}
