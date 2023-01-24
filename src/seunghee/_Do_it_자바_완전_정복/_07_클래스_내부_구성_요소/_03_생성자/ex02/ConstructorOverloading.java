package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._03_생성자.ex02;

public class ConstructorOverloading {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A(3);
        A a3 = new A(3, 5);
    }
}
class A {
    A() {
        System.out.println("첫 번째 생성자");
    }
    A(int a) {
        System.out.println("두 번째 생성자");
    }
    A(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}
