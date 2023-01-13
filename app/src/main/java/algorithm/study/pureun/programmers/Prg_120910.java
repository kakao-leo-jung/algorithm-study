package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 세균증식
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */
public class Prg_120910 {

	public static void main(String[] args) {
		Prg_120910 sol = new Prg_120910();
		int ans = sol.solution(2, 10);
		System.out.println(ans);

	}
	
	public int solution(int n, int t) {
        int answer = 0;
        int num = 1;
        for(int i = 0; i < t; i++) {
        	num =  num*2;
        }
        answer = n*num;
        return answer;
    }

}
