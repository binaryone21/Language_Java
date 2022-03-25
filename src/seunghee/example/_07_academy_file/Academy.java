package seunghee.example._07_academy_file;

import java.util.Scanner;

public class Academy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AcademyService srv = new AcademyService();
        srv.readAcademy();

        String check = "1";
        while(!check.equals("0")) {
            srv.displayMenu();
            check = sc.nextLine();

            switch(check) {
                case "1" : srv.insertAcademy(); break;
                case "2" : srv.voListAcademy(); break;
                case "3" : srv.selectAcademy(); break;
                case "4" : srv.updateAcademy(); break;
                case "5" : srv.deleteAcademy(); break;
                case "0" : System.out.println("프로그램을 종료합니다.");
                            srv.writeAcademy(); break;
                default : System.out.println("번호를 다시 확인해주세요."); break;
            }
        }
    }
}
