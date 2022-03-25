package seunghee.coding.basic._2_for_while;

public class _02 {
    public static void main(String[] args) {
    	
    	// 1 ~ 9, 9 ~ 1 로 출력되는 구구단 
    	
        int i = 1, a = 1;

        for (int j = 2; j<=9 ; j++) {
        	System.out.printf("\n %d단 \n", j);
            for (int cnt = 1; cnt <= 9; cnt++ ) {
                System.out.printf("%d X %d = %d \n",j , i, (j*i));
                i = i + a;
            }
            System.out.println(" ");
            a = -a;
            i = i + a;
        }
    }
}
