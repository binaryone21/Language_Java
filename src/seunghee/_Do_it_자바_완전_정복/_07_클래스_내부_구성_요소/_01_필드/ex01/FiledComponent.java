package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._01_필드.ex01;

public class FiledComponent {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        A a = new A();

        // 필드값 출력
        System.out.println(a.m);
        System.out.println(a.n);

        // 메서드 호출
        a.work1();
    }
}

class A {
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
