package seunghee.coding.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다.
 * 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만,
 * 요즘 신규 사용자의 수가 급감한 것이다.
 * 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
 * 이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다.
 * 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만,
 * 실패율을 구하는 부분에서 위기에 빠지고 말았다.
 * 오렐리를 위해 실패율을 구하는 코드를 완성하라.
 * 실패율은 다음과 같이 정의한다.
 * 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
 * 전체 스테이지의 개수 N,
 * 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
 * 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성하라.
 */
public class 실패율 {
	public static void main(String[] args) {
		
		// 입력
		print(solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));
		// print(solution(4, new int[] {4, 4, 4, 4, 4}));
	}
	
	public static int[] solution(int num, int[] stages) {
		// 각 스테이지 별 유저수 배열
		int[] users = new int[num+1];
		for(int i=0; i<stages.length; i++) {
			if(stages[i] <= num) {
				users[stages[i]-1]++;
			} else {
				users[num]++;
			}
		}
		
		// 각 스테이지 별 난이도 배열
		// double[] hards = new double[num];
		ArrayList<Double> hards = new ArrayList<Double>();
		double[] hardCopy = new double[num];
		double totalUser = users[num];
		for(int i=num-1; i>=0; i--) {
			hards.add(totalUser / (totalUser + users[i]));
			hardCopy[i] = hards.get(num-1-i);
			totalUser += users[i];
		}

		
		// 난이도 배열  정렬
		int[] answer = new int[num];
		Arrays.sort(hardCopy);
		for(int i=0; i<num; i++) {
			System.out.println(hardCopy[i]);
			answer[i] = hards.indexOf(hardCopy[i]); 
			System.out.println(answer[i]);
		}
		
		return answer;
	}
	
	public static void print(int[] answer) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<answer.length; i++) {
			sb.append(answer[i]+1);
			if(i != answer.length-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
