package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._04_인스턴스_필드와_정적_멤버의_중복.ex01;

class A {
    int m = 3;
}

class B extends A {
    int m = 4;
}

public class OverlapInstanceField {
    public static void main(String[] args) {
        // 객체 생성
        A aa = new A();
        B bb = new B();
        A ab = new B();

        // 인스턴스 필드
        System.out.println(aa.m);
        System.out.println(bb.m);
        System.out.println(ab.m);
    }
}
