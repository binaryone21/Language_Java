package seunghee.study.Do_It_자바_프로그래밍_입문._11_기본_클래스._02_String_클래스;

public class _02_StringTest02 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr);
        System.out.println("처음 문자열 주소 값 : " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr);

        System.out.println(javaStr);
        System.out.println("연결된 문자열 주소 값 : " + System.identityHashCode(javaStr));
    }
}
