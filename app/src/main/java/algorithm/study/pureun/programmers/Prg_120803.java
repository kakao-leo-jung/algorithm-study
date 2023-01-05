package algorithm.study.pureun.programmers;


/**
 * 프로그래머스 - 두 수의 차
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120803
 */
public class Prg_120803 {

	public static void main(String[] args) {
		Prg_120803 sol = new Prg_120803();
		
		int ans = sol.solution(2, 3);
		System.out.println(ans);
		
	}
	
	public int solution(int num1, int num2) {
        
		int answer = num1-num2;
        return answer;
    }

}
