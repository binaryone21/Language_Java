package seunghee.coding.basic._1_numbers;

public class _03 {
    public static void main(String[] args) {

    	// Sum = 1 + 3 + 5 + ... + NUM
    	
        int num = 10;
        int sum = 0;

        for(int i=0; i<=num; i++) {
            sum += (2*i) + 1;
        }

        System.out.println(sum);
    }
}
