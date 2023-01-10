package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 배열의 유사도
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class Prg_120903 {

	public static void main(String[] args) {
		Prg_120903 sol =  new Prg_120903();
		
		String[] input1 = new String[] {"a","b", "c"};
		String[] input2 = new String[] {"com","b", "d","p","c"};
		int ans = sol.solution(input1,input2);
		System.out.println(ans);

	}
	
	public int solution(String[] s1, String[] s2) {
        int answer = 0;
       
        for(int st = 0; st < s1.length; st++) {
        	for(int nd =0; nd < s2.length; nd++)
        	{
        		if(s1[st].equals(s2[nd])) {
        			answer++;
        		}
        	}
        }
       
        return answer;
    }

}
