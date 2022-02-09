package seunghee.coding.baekjoon._02_if문;

import java.util.Scanner;

public class _01_두_수_비교하기 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a > b) ? ">" : (a < b) ? "<" : "==");
	}
}
