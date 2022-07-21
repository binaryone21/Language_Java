package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._06_최상위_클래스_Object;

class _02_A {
    String name;
    _02_A(String name) {
        this.name = name;
    }
}

class _02_B {
    String name;
    _02_B(String name) {
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if(this.name == ((_02_B)obj).name) {
            return true;
        } else {
            return false;
        }
    }
}

public class _02_ObjectMethod_equals {
    public static void main(String[] args) {
        _02_A a1 = new _02_A("안녕");
        _02_A a2 = new _02_A("안녕");
        System.out.println(a1 == a2);       // false
        System.out.println(a1.equals(a2));  // false

        _02_B b1 = new _02_B("안녕");
        _02_B b2 = new _02_B("안녕");
        System.out.println(b1 == b2);       // false
        System.out.println(b1.equals(b2));  // true
    }
}
