package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._06_최상위_클래스_Object;

class _01_A {
    int a = 3;
    int b = 4;
}

class _01_B {
    int a = 3;
    int b = 4;

    public String toString() {
        return "필드값(a, b) = " + a + " " + b;
    }
}

public class _01_ObjectMethod_toString {
    public static void main(String[] args) {
        // 객체 생성
        _01_A a = new _01_A();
        _01_B b = new _01_B();

        // 메서드 호출
        System.out.printf("%x\n", a.hashCode());    // hashcode를 16진수로 표현
        System.out.println(a.toString());
        System.out.println(b);
    }
}
