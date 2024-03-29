package seunghee._Do_it_자바_완전_정복._05_참조_자료형._02_문자열을_저장하는_String.ex06;

import java.util.Arrays;

public class MethodsOfString_2 {
    public static void main(String[] args) {
        // 문자열 수정
        // @toLowerCase(), toUpperCase()
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        
        // @replace()
        System.out.println(str1.replace("Study", "공부"));

        // @substring()
        System.out.println(str1.substring(0, 5));

        // @split()
        String[] strArray = "abc/def-ghi jkl".split("/|-| ");
        System.out.println(Arrays.toString(strArray));

        // @trim()
        System.out.println("   abc   ".trim());
        System.out.println();

        // 문자열의 내용 비교
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("java");

        // @Stack 메모리 비교(==) : 위치(번지) 비교
        System.out.println(str2 == str3);
        System.out.println(str3 == str4);
        System.out.println(str4 == str2);

        // @equals(), equalsIgnoreCase() : 내용 비교
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
