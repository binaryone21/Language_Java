package seunghee._Do_it_자바_완전_정복._11_자바_제어자_2._01_final_제어자;

class _01_A1 {
    int a = 3;
    final int b = 5;
    _01_A1() {

    }
}

class _01_A2 {
    int a;
    final int b;
    _01_A2() {
        a = 3;
        b = 5;
    }
}

class _01_A3 {
    int a = 3;
    final int b = 5;
    _01_A3() {
        a = 5;
        // b = 5; -> final 필드는 최초 선언된 이후 값을 대입할 수 없음.
    }
}

class _01_B {
    void bcd() {
        int a = 3;
        final int b = 5;
        a = 7;
        // b = 9; -> final 지역 변수도 최초 선언된 이후 값을 대입할 수 없음.
    }
}

public class _01_FinalModifier_1 {
    public static void main(String[] args) {
        // 객체 생성
        _01_A1 a1 = new _01_A1();
        _01_A2 a2 = new _01_A2();

        // 필드값 변경
        a1.a = 7;
        // a1.b = 9; -> final 필드는 한 번 정해진 값을 변경할 수 없음.
        a2.a = 7;
        // a2.b = 9; -> final 필드는 한 번 정해진 값을 변경할 수 없음.
    }
}
