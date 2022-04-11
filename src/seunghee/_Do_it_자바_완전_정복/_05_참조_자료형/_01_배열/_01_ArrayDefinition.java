package seunghee._Do_it_자바_완전_정복._05_참조_자료형._01_배열;

public class _01_ArrayDefinition {
    public static void main(String[] args) {
        // 배열의 선언 방법 1
        int[] array1 = new int[3];
        int[] array2;
        array2 = new int[3];

        // 배열의 선언 방법 2
        int array3[] = new int[3];
        int array4[];
        array4 = new int[3];

        // 다양한 배열 선언(기본 자료형 배열, 참조 자료형 배열)
        boolean[] array5 = new boolean[3];
        int[] array6 = new int[5];
        double[] array7 = new double[7];
        String[] array8 = new String[9];
    }
}
