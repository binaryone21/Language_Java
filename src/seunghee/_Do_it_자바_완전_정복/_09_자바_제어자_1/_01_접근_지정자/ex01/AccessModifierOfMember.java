package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01;

import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack1.A;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack1.B;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack2.C;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자.ex01.pack2.D;

public class AccessModifierOfMember {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
