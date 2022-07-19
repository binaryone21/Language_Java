package seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자;

import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자._01_pack1._01_A;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자._01_pack1._01_B;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자._01_pack2._01_C;
import seunghee._Do_it_자바_완전_정복._09_자바_제어자_1._01_접근_지정자._01_pack2._01_D;

public class _01_AccessModifierOfMember {
    public static void main(String[] args) {
        _01_A a = new _01_A();
        _01_B b = new _01_B();
        _01_C c = new _01_C();
        _01_D d = new _01_D();

        a.print();
        b.print();
        c.print();
        d.print();
    }
}
