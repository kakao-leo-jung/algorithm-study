package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 짝수의 합
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class Prg_120831 {

	public static void main(String[] args) {
		Prg_120831 sol = new Prg_120831();
		int ans = sol.solution(10);
		System.out.println(ans);

	}
	
	public int solution(int n) {
        int answer = 0;
        
        int sum = 0;
        for(int i = 1; i <= n; i++) {
        	if(i%2 == 0) {
        		sum += i;
        	}
        }
        
        answer = sum;
        return answer;
    }

}
