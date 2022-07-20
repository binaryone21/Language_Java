package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._04_인스턴스_필드와_정적_멤버의_중복;

class _02_A {
    static int m = 3;
}

class _02_B extends _02_A {
    static int m = 4;
}

public class _02_OverlapStaticField {
    public static void main(String[] args) {
        // 클래스명으로 바로 접근
        System.out.println(_02_A.m);
        System.out.println(_02_B.m);
        System.out.println();

        // 객체 생성
        _02_A aa = new _02_A();
        _02_B bb = new _02_B();
        _02_A ab = new _02_B();

        // 생성한 객체로 정적 필드 호출
        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}
