package seunghee.coding.programmers.level1;
/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 */
public class _30_가운데_글자_가져오기 {

    // 입력
    public static void main(String[] args) {
        print(solution("abcde"));
        print(solution("qwer"));
    }

    // 연산
    public static String solution(String str) {
        int length = str.length();
        int index = length/2;
        if(length%2 == 0) {
            return str.substring(index-1, index+1);
        } else {
            return str.substring(index, index+1);
        }
    }

    // 출력
    public static void print(String answer) {
        System.out.println(answer);
    }
}
