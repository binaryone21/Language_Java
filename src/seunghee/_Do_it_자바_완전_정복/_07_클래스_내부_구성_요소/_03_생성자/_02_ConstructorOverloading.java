package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._03_생성자;

public class _02_ConstructorOverloading {
    public static void main(String[] args) {
        _02_A a1 = new _02_A();
        _02_A a2 = new _02_A(3);
        _02_A a3 = new _02_A(3, 5);
    }
}
class _02_A {
    _02_A() {
        System.out.println("첫 번째 생성자");
    }
    _02_A(int a) {
        System.out.println("두 번째 생성자");
    }
    _02_A(int a, int b) {
        System.out.println("세 번째 생성자");
    }
}
