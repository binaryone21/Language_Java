package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._01_클래스_상속의_개념과_문법적_특징.ex02;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class Polymorphism {
    public static void main(String[] args) {
        // A 타입의 다형적 표현
        A a1 = new A();     // A는 A이다. (O)
        A a2 = new B();     // B는 A이다. (O)
        A a3 = new C();     // C는 A이다. (O)
        A a4 = new D();     // D는 A이다. (O)

        // B 타입의 다형적 표현
        // B b1 = new A();  // A는 B이다. (X)
        B b2 = new B();     // B는 B이다. (O)
        B b3 = new C();     // C는 B이다. (O)
        B b4 = new D();     // D는 B이다. (O)

        // C 타입의 다형적 표현
        // C c1 = new A();  // A는 C이다. (X)
        // C c2 = new B();  // B는 C이다. (X)
        C c3 = new C();     // C는 C이다. (O)
        // C c4 = new D();  // D는 C이다. (X)

        // D 타입의 다형적 표현
        // D d1 = new A();  // A는 D이다. (X)
        // D d2 = new B();  // A는 D이다. (X)
        // D d3 = new C();  // A는 D이다. (X)
        D d4 = new D();     // A는 D이다. (O)
    }
}
