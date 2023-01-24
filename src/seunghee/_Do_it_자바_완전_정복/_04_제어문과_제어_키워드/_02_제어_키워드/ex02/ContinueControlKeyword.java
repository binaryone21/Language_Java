package seunghee._Do_it_자바_완전_정복._04_제어문과_제어_키워드._02_제어_키워드.ex02;

public class ContinueControlKeyword {
    public static void main(String[] args) {
        // 단일 반복문에서 continue 사용
        for(int i=0; i<10; i++) {
            continue;
            // System.out.println();
        }

        for(int i=0; i<10; i++) {
            System.out.print(i + " ");
            continue;
        }
        System.out.println();

        for(int i=0; i<10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 다중 반복문에서 continue 사용
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j == 3) {
                    continue;
                }
                System.out.println(i + ", " + j);
            }
        }
        System.out.println();

        POS1 : for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j == 3) {
                    continue POS1;
                }
                System.out.println(i + ", " + j);
            }
        }
    }
}
