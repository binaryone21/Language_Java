package seunghee._Do_it_자바_완전_정복._04_제어문과_제어_키워드._01_제어문;

public class _02_ForControlStatement {
    public static void main(String[] args) {
        // for 문 기본 문법 구조
        int a;
        for(a=0; a<3; a++) {
            System.out.print(a + " ");
        }
        System.out.println();

        for(int i=0; i<3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=0; i<100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=10; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=0; i<10; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=0, j=0; i<10; i++, j++) {
            System.out.print(i + j + " ");
        }
        System.out.println();

        // for 문의 특수한 형태(무한 루프)
        /*
            for(int i=0; ; i++) {
                System.out.println(i + " ");
            }
            for(;;) {
                System.out.println("무한 루프");
            }
        */
        System.out.println();
        
        // 무한 루프 탈출
        for(int i=0; ; i++) {
            if(i>10) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("무한 루프 탈출");
    }
}
