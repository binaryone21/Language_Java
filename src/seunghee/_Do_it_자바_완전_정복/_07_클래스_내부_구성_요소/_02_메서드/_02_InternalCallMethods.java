package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._02_메서드;

public class _02_InternalCallMethods {
    public static void main(String[] args) {
        // 같은 클래스 안에 있는 내부 메서드 호출
        print();
        
        int a = twice(3);
        System.out.println(a);
        
        double b = sum(a, 5.8);
        System.out.println(b);
    }
    
    public static void print() {
        System.out.println("안녕");
    }

    public static int twice(int k) {
        return k * 2;
    }

    public static double sum(int m, double n) {
        return m + n;
    }
}
