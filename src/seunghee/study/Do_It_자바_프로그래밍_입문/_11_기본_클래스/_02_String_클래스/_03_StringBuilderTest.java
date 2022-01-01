package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._02_String_클래스;

public class _03_StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("JavaStr 문자열 주소 : " + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");
        System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));
    }
}
