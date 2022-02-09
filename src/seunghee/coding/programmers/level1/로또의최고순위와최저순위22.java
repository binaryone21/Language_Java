package seunghee.coding.programmers.level1;

public class 로또의최고순위와최저순위22 {
	public static void main(String[] args)  {

	}
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = {7, 7};
	        for(int i=0; i<6; i++) {
	            for(int j=0; j<6; j++) {
	                if(lottos[i] == win_nums[j]) {
	                    answer[0]--;
	                    answer[1]--;
	                } 
	            }
	            if(lottos[i]==0) {
	                answer[0]--;
	            }
	        }
	        answer[0] = (answer[0] == 7) ? answer[0]-1 : answer[0];
	        answer[1] = (answer[1] == 7) ? answer[1]-1 : answer[1];
	        return answer;
	    }
	}
}
