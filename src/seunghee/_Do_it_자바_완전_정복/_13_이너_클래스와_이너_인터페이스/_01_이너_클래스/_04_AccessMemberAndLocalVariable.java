package seunghee._Do_it_자바_완전_정복._13_이너_클래스와_이너_인터페이스._01_이너_클래스;

class _04_A {
    int a = 3;      // 필드
    void abc() {
        int b = 5;  // 지역 변수
        // 지역 이너 클래스
        class _04_B {
            void bcd() {
                System.out.println(a);
                System.out.println(b);
                a = 5;
                // b = 7;
            }
        }
        _04_B bb = new _04_B();
        bb.bcd();
    }
}

public class _04_AccessMemberAndLocalVariable {
    public static void main(String[] args) {
        // 객체 생성 및 메서드 호출
        _04_A a = new _04_A();
        a.abc();
    }
}
