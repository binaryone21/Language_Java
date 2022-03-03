package seunghee._Do_it_자바_프로그래밍_입문._14_예외_처리._02_예외_처리하기;

public class _01_ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        try {
            for(int i=0; i<=5; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외 처리 부분");
        }
        System.out.println("프로그램 종료");
    }
}
