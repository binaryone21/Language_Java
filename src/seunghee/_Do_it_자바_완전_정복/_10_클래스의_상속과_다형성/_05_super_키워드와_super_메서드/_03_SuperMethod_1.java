package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._05_super_키워드와_super_메서드;

class _03_A {
    _03_A() {
        System.out.println("A 생성자");
    }
}

class _03_B extends _03_A {
    _03_B() {
        super();    // 생략했을 때 컴파일러가 자동 추가(부모 클래스의 생성자 호출)
        System.out.println("B 생성자");
    }
}

class _03_C {
    _03_C(int a) {
        System.out.println("C 생성자");
    }
}

class _03_D extends _03_C {
    /* 컴파일러가 자동으로 추가해 주는 내용
        _03_D() {
            super();
        }
     */
    _03_D() {
        super(3);
    }
}

public class _03_SuperMethod_1 {
    public static void main(String[] args) {
        // A 객체 생성
        _03_A aa = new _03_A();
        System.out.println();

        // B 객체 생성
        _03_B bb = new _03_B();
    }
}
