package seunghee._Do_it_자바_완전_정복._07_클래스_내부_구성_요소._02_메서드.ex05;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3};
        modifyData(array);
        printArray(array);
    }
    public static void modifyData(int[] a) {
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
    }
    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
