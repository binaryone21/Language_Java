package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._01_필드;

public class _01_FiledComponent {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        _01_A a = new _01_A();

        // 필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);

        // 메서드 호출
        a.work1();
    }
}
class _01_A {
    int m = 3;
    int n = 4;
    void work1() {
        int k = 5;
        System.out.println(k);
        work2(3);
    }
    void work2(int i) {
        int j = 4;
        System.out.println(i + j);
    }
}
