package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스.ex02;

interface A {}
interface B {}

// 단일 인터페이스 상속
class C implements A {}

// 다중 인터페이스 상속
class D implements A, B {}

// 클래스와 인터페이스를 한 번에 상속
class E extends C implements A, B {}

public class InheritanceOfInterface_1 {
    public static void main(String[] args) {
    }
}
