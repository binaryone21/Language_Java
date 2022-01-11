package seunghee.study.Do_It_자바_프로그래밍_입문._15_자바_입출력._02_표준_입출력;

import java.util.Scanner;

public class _03_ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = scanner.nextLine();
        System.out.print("직업 : ");
        String job = scanner.nextLine();
        System.out.print("사번 : ");
        int num = scanner.nextInt();

        System.out.println(name);
        System.out.println(job);
        System.out.println(num);
    }
}
