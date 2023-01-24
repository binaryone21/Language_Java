package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._03_메서드_오버라이딩.ex04;

class A {
    protected void abc() {}
}

class B1 {
    public void abc() {}
}

class B2 {
    protected void abc() {}
}

class B3 {
    // void abc() {}            // default 접근 지정자(좁아져서 불가능)
}

class B4 {
    // private void abc() {}    // private 접근 지정자(좁아져서 불가능)
}

public class MethodOverriding_4 {
    public static void main(String[] args) {

    }
}
