package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._05_super_키워드와_super_메서드;

class _04_A {
    _04_A() {
        this(3);
        System.out.println("A 생성자 1");
    }
    _04_A(int a) {
        System.out.println("A 생성자 2");
    }
}

class _04_B extends _04_A {
    _04_B() {
        this(3);
        System.out.println("B 생성자 1");
    }
    _04_B(int a) {
        System.out.println("B 생성자 2");
    }
}

public class _04_SuperMethod_2 {
    public static void main(String[] args) {
        // A 객체 생성
        _04_A aa1 = new _04_A();
        System.out.println();
        _04_A aa2 = new _04_A(3);
        System.out.println();

        // B 객체 생성
        _04_B bb1 = new _04_B();
        System.out.println();
        _04_B bb2 = new _04_B(3);
    }
}
