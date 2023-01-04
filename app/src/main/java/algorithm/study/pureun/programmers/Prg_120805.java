package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 몫 구하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120805
 */
public class Prg_120805 {

	public static void main(String[] args) {
		Prg_120805 sol = new Prg_120805();
		
		int ans = sol.solution(7, 2);
		System.out.println(ans);

	}
	
	public int solution(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

}
