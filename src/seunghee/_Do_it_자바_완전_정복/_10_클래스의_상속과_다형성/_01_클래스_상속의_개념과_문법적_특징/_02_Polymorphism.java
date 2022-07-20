package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._01_클래스_상속의_개념과_문법적_특징;

class _02_A {}
class _02_B extends _02_A {}
class _02_C extends _02_B {}
class _02_D extends _02_B {}

public class _02_Polymorphism {
    public static void main(String[] args) {
        // A 타입의 다형적 표현
        _02_A a1 = new _02_A();     // A는 A이다. (O)
        _02_A a2 = new _02_B();     // B는 A이다. (O)
        _02_A a3 = new _02_C();     // C는 A이다. (O)
        _02_A a4 = new _02_D();     // D는 A이다. (O)

        // B 타입의 다형적 표현
        // _02_B b1 = new _02_A();  // A는 B이다. (X)
        _02_B b2 = new _02_B();     // B는 B이다. (O)
        _02_B b3 = new _02_C();     // C는 B이다. (O)
        _02_B b4 = new _02_D();     // D는 B이다. (O)

        // C 타입의 다형적 표현
        // _02_C c1 = new _02_A();  // A는 C이다. (X)
        // _02_C c2 = new _02_B();  // B는 C이다. (X)
        _02_C c3 = new _02_C();     // C는 C이다. (O)
        // _02_C c4 = new _02_D();  // D는 C이다. (X)

        // D 타입의 다형적 표현
        // _02_D d1 = new _02_A();  // A는 D이다. (X)
        // _02_D d2 = new _02_B();  // A는 D이다. (X)
        // _02_D d3 = new _02_C();  // A는 D이다. (X)
        _02_D d4 = new _02_D();     // A는 D이다. (O)
    }
}
