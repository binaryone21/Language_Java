package seunghee._Do_it_자바_완전_정복._10_클래스의_상속과_다형성._02_객체의_타입_변환.ex03;

/* 캐스팅의 가능 여부를 확인할 수 있는 instanceof */
class A {}
class B extends A {}

public class Typecasting_3 {
    public static void main(String[] args) {
        // instanceof
        A aa = new A();
        A ab = new B();

        System.out.println(aa instanceof A);
        System.out.println(ab instanceof A);

        System.out.println(aa instanceof B);
        System.out.println(ab instanceof B);

        if(aa instanceof B) {
            B b = (B) aa;
            System.out.println("aa를 B로 캐스팅했습니다.");
        } else {
            System.out.println("aa는 B 타입으로 캐스팅이 불가능!!!");
        }

        if(ab instanceof B) {
            B b = (B) ab;
            System.out.println("ab를 B로 캐스팅했습니다.");
        } else {
            System.out.println("ab는 B 타입으로 캐스팅이 불가능!!!");
        }

        if("안녕" instanceof String) {
            System.out.println("\"안녕\"은 String 클래스입니다.");
        }
    }
}
