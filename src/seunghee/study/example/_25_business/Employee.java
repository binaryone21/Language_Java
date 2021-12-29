package seunghee.study.example._25_business;

import java.util.Scanner;

public class Employee {
	public static void main ( String [] args ) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    EmployeeService ser = new EmployeeService();

	    String check = "";
	    while ( !check.equals("0")) {
	    	ser.displayMenu();
	    	check = sc.nextLine();
	    	switch (check) {
	    		case "1": ser.readInfo(); break;
	    		case "2": ser.showInfo(); break;
	    		case "3": ser.showAllInfo(); break;
	    		case "4": ser.modifyInfo(); break;
	    		case "5": ser.removeInfo(); break;
	    		case "0": System.out.println("프로그램을 종료합니다."); break;
	    		default : System.out.println("번호를 다시 확인해주세요.");
	    	}
	    }
	}
}
