package seunghee._Do_it_자바_완전_정복._05_참조_자료형._02_문자열을_저장하는_String;

public class _03_SharingStringObject {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = "안녕";
        String str3 = "안녕";
        String str4 = new String("안녕");

        // 스택 메모리값 비교(==)
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str1);
    }
}
