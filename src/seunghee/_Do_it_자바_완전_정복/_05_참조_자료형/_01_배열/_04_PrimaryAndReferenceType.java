package seunghee._Do_it_자바_완전_정복._05_참조_자료형._01_배열;

public class _04_PrimaryAndReferenceType {
    public static void main(String[] args) {
        // 기본 자료형의 대입 연산
        int value1 = 3;
        int value2 = value1;
        value2 = 7;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println();

        // 참조 자료형의 대입 연산
        int[] array1 = new int[] {3, 4, 5};
        int[] array2 = array1;
        array2[0] = 7;
        System.out.println(array1[0]);
        System.out.println(array2[0]);
    }
}
