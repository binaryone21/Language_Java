package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._03_생성자.ex01;

public class DefaultConstructor {
    public static void main(String[] args) {

        // 클래스의 객체 생성
        A a = new A();
        B b = new B();
        // C c = new C();
        C c = new C(3);

        // 메서드 호출
        a.work();
        b.work();
        c.work();
    }
}
class A {
    int m;
    void work() {
        System.out.println(m);
    }
}
class B {
    int m;
    void work() {
        System.out.println(m);
    }
    B() {

    }
}
class C {
    int m;
    void work() {
        System.out.println(m);
    }
    C(int a) {
        m = a;
    }
}