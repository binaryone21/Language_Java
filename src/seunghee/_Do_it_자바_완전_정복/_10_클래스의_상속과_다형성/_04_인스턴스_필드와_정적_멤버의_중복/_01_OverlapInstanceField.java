package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._04_인스턴스_필드와_정적_멤버의_중복;

class _01_A {
    int m = 3;
}

class _01_B extends _01_A {
    int m = 4;
}

public class _01_OverlapInstanceField {
    public static void main(String[] args) {
        // 객체 생성
        _01_A aa = new _01_A();
        _01_B bb = new _01_B();
        _01_A ab = new _01_B();

        // 인스턴스 필드
        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}
