package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 두 수의 합
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120802
 */
public class Prg_120802 {

	public static void main(String[] args) {
		Prg_120802 sol = new Prg_120802();
		
        int ans = sol.solution(2, 3);
        System.out.println(ans);
	}
	
	public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

}
