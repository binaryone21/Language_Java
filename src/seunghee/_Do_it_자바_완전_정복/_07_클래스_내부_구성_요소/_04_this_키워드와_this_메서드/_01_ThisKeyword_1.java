package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._04_this_키워드와_this_메서드;

public class _01_ThisKeyword_1 {
    public static void main(String[] args) {
        // 클래스 객체 생성
        _01_A a = new _01_A();
        // 메서드 호출 / 필드값 활용
        a.work();
        System.out.println(a.m);
        System.out.println(a.n);
    }
}
class _01_A {
    int m;
    int n;
    void init(int a, int b) {
        int c;
        c = 3;
        this.m = a;
        this.n = b;
    }
    void work() {
        this.init(2, 3);
    }
}
