package seunghee._Do_it_자바_완전_정복._03_연산자._02_연산자의_연산_방법;

public class _07_ConditionalOperator {
    public static void main(String[] args) {
        // 삼항 연산자
        int value1 = (3 > 5) ? 6 : 9;
        System.out.println(value1);
        
        int value2 = (5 > 3) ? 10 : 20;
        System.out.println(value2);
        
        int value3 = 3;
        System.out.println((value3 % 2 == 0) ? "짝수" : "홀수");
        
        //cf. if-else 구문으로 변환
        if(value3 % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}
