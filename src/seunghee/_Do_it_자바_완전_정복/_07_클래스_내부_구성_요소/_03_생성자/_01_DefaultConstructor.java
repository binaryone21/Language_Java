package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._03_생성자;

public class _01_DefaultConstructor {
    public static void main(String[] args) {

        // 클래스의 객체 생성
        _01_A a = new _01_A();
        _01_B b = new _01_B();
        // _01_C c = new _01_C();
        _01_C c = new _01_C(3);

        // 메서드 호출
        a.work();
        b.work();
        c.work();
    }
}
class _01_A {
    int m;
    void work() {
        System.out.println(m);
    }
}
class _01_B {
    int m;
    void work() {
        System.out.println(m);
    }
    _01_B() {

    }
}
class _01_C {
    int m;
    void work() {
        System.out.println(m);
    }
    _01_C(int a) {
        m = a;
    }
}