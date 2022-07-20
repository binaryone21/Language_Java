package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._03_메서드_오버라이딩;

class _04_A {
    protected void abc() {}
}

class _04_B1 {
    public void abc() {}
}

class _04_B2 {
    protected void abc() {}
}

class _04_B3 {
    // void abc() {}            // default 접근 지정자(좁아져서 불가능)
}

class _04_B4 {
    // private void abc() {}    // private 접근 지정자(좁아져서 불가능)
}

public class _04_MethodOverriding_4 {
    public static void main(String[] args) {

    }
}
