package seunghee._Do_it_자바_완전_정복._12_추상_클래스와_인터페이스._02_인터페이스;

interface _02_A {}
interface _02_B {}

// 단일 인터페이스 상속
class _02_C implements _02_A {}

// 다중 인터페이스 상속
class _02_D implements _02_A, _02_B {}

// 클래스와 인터페이스를 한 번에 상속
class _02_E extends _02_C implements _02_A, _02_B {}

public class _02_InheritanceOfInterface_1 {
    public static void main(String[] args) {
    }
}
