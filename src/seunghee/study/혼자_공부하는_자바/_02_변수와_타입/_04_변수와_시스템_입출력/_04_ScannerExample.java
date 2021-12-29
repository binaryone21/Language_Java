package seunghee.study.혼자_공부하는_자바._02_변수와_타입._04_변수와_시스템_입출력;

import java.util.Scanner;

@SuppressWarnings("resource")
public class _04_ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \""+inputData+"\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
	}
}
