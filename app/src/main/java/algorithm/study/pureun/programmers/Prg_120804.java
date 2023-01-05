package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 두 수의 곱
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120804
 */
public class Prg_120804 {

	public static void main(String[] args) {
		Prg_120804 sol = new Prg_120804();
		
        int ans = sol.solution(3, 4);
        System.out.println(ans);
	}
	
	public int solution(int num1, int num2) {
        int answer = num1*num2;
        return answer;
    }

}
