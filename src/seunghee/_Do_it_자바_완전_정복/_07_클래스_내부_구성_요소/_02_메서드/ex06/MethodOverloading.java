package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._02_메서드.ex06;

public class MethodOverloading {
    public static void main(String[] args) {
        print();
        print(3);
        print(5.8);
        print(2, 5);
    }
    public static void print() {
        System.out.println("데이터가 없습니다.");
    }
    public static void print(int a) {
        System.out.println(a);
    }
    public static void print(double a) {
        System.out.println(a);
    }
    /*
    public static void print(double b) {
        System.out.println(b);
    }
     */
    public static void print(int a, int b) {
        System.out.println("a : " + a + " b : " + b);
    }
    /*
    public static int print(int a, int b) {
        System.out.println("a : " + a + " b : " + b);
        return a + b;
    }
     */
}
