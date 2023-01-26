package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기.ex04;

public class AutoCLoseTest {
    public static void main(String[] args) {
        try(AutoCLoseObj obj = new AutoCLoseObj()) {
            
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
