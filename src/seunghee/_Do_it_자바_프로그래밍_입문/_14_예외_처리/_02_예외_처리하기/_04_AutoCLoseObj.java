package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기;

public class _04_AutoCLoseObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("리소스가 close() 되었습니다.");
    }
}
