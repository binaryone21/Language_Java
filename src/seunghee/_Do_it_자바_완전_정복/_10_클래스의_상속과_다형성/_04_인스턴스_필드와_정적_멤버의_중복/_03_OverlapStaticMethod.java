package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._04_인스턴스_필드와_정적_멤버의_중복;

class _03_A {
    static void print() {
        System.out.println("A 클래스");
    }
}

class _03_B extends _03_A {
    static void print() {
        System.out.println("B 클래스");
    }
}

public class _03_OverlapStaticMethod {
    public static void main(String[] args) {
        // 클래스명으로 바로 접근
        _03_A.print();
        _03_B.print();
        System.out.println();

        // 객체 생성
        _03_A aa = new _03_A();
        _03_B bb = new _03_B();
        _03_A ab = new _03_B();

        // 객체를 통한 메서드 호출
        aa.print();
        bb.print();
        ab.print();
    }
}
