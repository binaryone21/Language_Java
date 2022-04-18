package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._04_this_키워드와_this_메서드;

public class _03_ThisMethod_1 {
    public static void main(String[] args) {
        // 객체 생성
        _03_A a1 = new _03_A();
        System.out.println();
        _03_A a2 = new _03_A(3);
    }
}
class _03_A {
    _03_A() {
        System.out.println("첫 번째 생성자");
    }
    _03_A(int a) {
        this();
        System.out.println("두 번째 생성자");
    }
    /*
    void abc() {
        this();
    }
    */
}
