package seunghee._Do_it_자바_완전_정복._14_예외_처리._02_예외_처리;

class _06_A implements AutoCloseable {
    String resource;

    _06_A(String resource) {
        this.resource = resource;
    }

    @Override
    public void close() throws Exception {
        if (resource != null) {
            resource = null;
            System.out.println("리소스가 해제됐습니다.");
        }
    }
}

public class _06_tryWithResource_2 {
    public static void main(String[] args) {

        // 1. 리소스를 사용하고 finally에서 리로스 수동 해제하기
        _06_A a1 = null;
        try {
            a1 = new _06_A("특정 파일");
        } catch (Exception e) {
            System.out.println("예외 처리");
        } finally {
            // 리소스 수동 해제
            if(a1.resource != null) {
                try {
                    a1.close();
                } catch (Exception e) {

                }
            }
        }

        // 2. 리소스 자동 해제
        try (_06_A a2 = new _06_A("특정 파일");) {

        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }
}
