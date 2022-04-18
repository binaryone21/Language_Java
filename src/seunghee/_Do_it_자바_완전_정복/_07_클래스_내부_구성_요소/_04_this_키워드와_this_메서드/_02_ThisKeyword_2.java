package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._04_this_키워드와_this_메서드;

public class _02_ThisKeyword_2 {
    public static void main(String[] args) {
        // 필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음.
        _02_A a = new _02_A();
        a.init(2, 3);
        System.out.println(a.m);
        System.out.println(a.n);

        // 필드명과 지역 변수명이 같고, this 키워드를 사용함.
        _02_B b = new _02_B();
        b.init(2, 3);
        System.out.println(b.m);
        System.out.println(b.n);
    }
}
class _02_A {
    int m;
    int n;
    void init(int m, int n) {
        m = m;
        n = n;
    }
}
class _02_B {
    int m;
    int n;
    void init(int m, int n) {
        this.m = m;
        this.n = n;
    }
}
