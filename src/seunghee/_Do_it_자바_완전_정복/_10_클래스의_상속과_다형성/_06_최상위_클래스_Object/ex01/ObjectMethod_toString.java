package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._06_최상위_클래스_Object.ex01;

class A {
    int a = 3;
    int b = 4;
}

class B {
    int a = 3;
    int b = 4;

    public String toString() {
        return "필드값(a, b) = " + a + " " + b;
    }
}

public class ObjectMethod_toString {
    public static void main(String[] args) {
        // 객체 생성
        A a = new A();
        B b = new B();

        // 메서드 호출
        System.out.printf("%x\n", a.hashCode());    // hashcode를 16진수로 표현
        System.out.println(a.toString());
        System.out.println(b);
    }
}
