package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 뒤집기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class Prg_120821 {

	public static void main(String[] args) {
		Prg_120821 sol = new Prg_120821();
		
		int[] n = new int[] {1,0,1,1,1,3,5};
		int[] ans = sol.solution(n);
		System.out.println(Arrays.toString(ans));

	}
	
	 public int[] solution(int[] num_list) {
	        int[] answer = {};
	        
	        for(int i =0; i<num_list.length/2; i++) {
	        	int temp =0;
	        	temp = num_list[i];
	        	num_list[i] = num_list[num_list.length-1-i];
	        	num_list[num_list.length-1-i] = temp;
	        }
	        answer = num_list;
	        return answer;
	    }

}
