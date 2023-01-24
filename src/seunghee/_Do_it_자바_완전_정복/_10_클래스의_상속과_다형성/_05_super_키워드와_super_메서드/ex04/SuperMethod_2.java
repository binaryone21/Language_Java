package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._05_super_키워드와_super_메서드.ex04;

class A {
    A() {
        this(3);
        System.out.println("A 생성자 1");
    }
    A(int a) {
        System.out.println("A 생성자 2");
    }
}

class B extends A {
    B() {
        this(3);
        System.out.println("B 생성자 1");
    }
    B(int a) {
        System.out.println("B 생성자 2");
    }
}

public class SuperMethod_2 {
    public static void main(String[] args) {
        // A 객체 생성
        A aa1 = new A();
        System.out.println();
        A aa2 = new A(3);
        System.out.println();

        // B 객체 생성
        B bb1 = new B();
        System.out.println();
        B bb2 = new B(3);
    }
}
