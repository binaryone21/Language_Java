package seunghee.coding.basic._4_line_up;

import java.util.Scanner;

public class LineUp_01 {
	public static void main(String[] args) {

		// 선택 정렬
		
        while(true) {

			Scanner scanner = new Scanner(System.in);
            System.out.print("원하는 배열의 크기를 입력해 주세요 : ");
            int order = scanner.nextInt();
            if (order == 0) {
                break;
            }

            int[] order2 = new int[order];
            for (int i = 0; i < order2.length; i++) {
                order2[i] = (int) (Math.random() * 101);
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");

            // 정렬 부분
            int sw = 0;
            for (int i = 0; i < order2.length - 1; i++) {
                for (int j = (i + 1); j < order2.length; j++) {
                    if (order2[i] > order2[j]) {
                        sw = order2[i];
                        order2[i] = order2[j];
                        order2[j] = sw;
                    }
                }
            }

            // 출력 부분		
            for (int i = 0; i < order2.length; i++) {
                System.out.printf("%3d ", order2[i]);
            }
            System.out.println("");
        }
    }
}