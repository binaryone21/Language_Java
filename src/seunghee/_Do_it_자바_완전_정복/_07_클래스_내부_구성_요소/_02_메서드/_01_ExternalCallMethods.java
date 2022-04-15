package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._02_메서드;

public class _01_ExternalCallMethods {
    public static void main(String[] args) {
        // 객체 생성
        _01_A a = new _01_A();

        // 메서드 호출(멤버 활용)
        a.print();
        int k = a.data();
        a.data();
        System.out.println(k);
        double result = a.sum(3, 5.2);
        System.out.println(result);
        a.printMonth(5);
        a.printMonth(15);
    }
}
class _01_A {
    // 리턴 타입 void, 입력매개변수 없음.
    void print() {
        System.out.println("안녕");
    }
    // 리턴 타입 int, 입력매개변수 없음.
    int data() {
        return 3;
    }
    // 리턴 타입 double, 입력매개변수 2개
    double sum(int a, double b) {
        return a + b;
    }
    // 리턴 타입 void, 내부에 리턴 포함(함수를 종료함)
    void printMonth(int m) {
        if(m < 0 || m > 12) {
            System.out.println("잘못된 입력");
            return;
        }
        System.out.println(m + "월입니다.");
    }
}
