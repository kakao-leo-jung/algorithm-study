package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 중복된 숫자 개수
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */
public class Prg_120583 {

	public static void main(String[] args) {
		Prg_120583 sol = new Prg_120583();
		
		int[] n = new int[] {1,1,2,3,4,5}; 
		int ans = sol.solution(n, 1);
		System.out.println(ans);

	}
	
	 public int solution(int[] array, int n) {
	        int answer = 0;
	        
	        for(int i =0; i <array.length; i++) {
	        	if(array[i] == n) {
	        		answer++;
	        	}
	        }
	        
	        return answer;
	    }

}
