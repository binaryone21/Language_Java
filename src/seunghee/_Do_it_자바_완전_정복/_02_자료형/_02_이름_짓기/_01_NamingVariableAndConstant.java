package seunghee._Do_it_자바_완전_정복._02_자료형._02_이름_짓기;

public class _01_NamingVariableAndConstant {
    public static void main(String[] args) {
        // 변수
        boolean aBcD;
        byte 가나다;         // 한글로 작성 가능 (권장하지 않음)
        short _abcd;
        char $ab_cd;
        // int 3abcd;       // 숫자는 이름 맨 앞에 올 수 없다.
        long abcd3;
        // float int;       // 자바 예약어는 사용할 수 없음.
        double main;
        // int my Work;     // 스페이스, 특수 키는 사용할 수 없음.
        String myClassName;
        int ABC;            // 전부 대문자로 작성 (권장하지 않음)
        
        // 상수
        final double PI;
        final int MY_DATA;
        final float myData;     // 소문자 사용 (권장하지 않음)
    }
}
