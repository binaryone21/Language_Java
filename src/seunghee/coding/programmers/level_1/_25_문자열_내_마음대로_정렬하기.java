package seunghee.coding.programmers.level_1;
/*
 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
 * 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
 * 예를 들어 strings가 ["sun", "bed", "car"]이고
 * n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _25_문자열_내_마음대로_정렬하기 {

	// 입력
	public static void main(String[] args) {
		print(solution(new String[] {"sun", "bed", "car"}, 1));
		print(solution(new String[] {"abce", "abcd", "cdx"}, 2));
	}
	
	// 연산
	public static String[] solution(String[] str, int num) {
		String[] answer = new String[str.length];
		
		ArrayList<String> strList = new ArrayList<String>();
		for(int i=0; i<str.length; i++) {
			strList.add(str[i].charAt(num) + str[i]);
		}
		
		Collections.sort(strList);
		for(int i=0; i<strList.size(); i++) {
			answer[i] = strList.get(i).substring(1);
		}
		
		return answer;
	}
	
	// 출력
	public static void print(String[] answer) {
		System.out.println(Arrays.toString(answer));
	}
}
