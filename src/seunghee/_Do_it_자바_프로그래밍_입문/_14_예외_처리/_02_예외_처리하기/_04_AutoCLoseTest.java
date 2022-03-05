package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기;

public class _04_AutoCLoseTest {
    public static void main(String[] args) {
        try(_04_AutoCLoseObj obj = new _04_AutoCLoseObj()) {
            
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
