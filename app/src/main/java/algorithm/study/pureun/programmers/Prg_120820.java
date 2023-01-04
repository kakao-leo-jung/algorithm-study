package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 나이 출력
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120820
 */
public class Prg_120820 {

	public static void main(String[] args) {
		Prg_120820 sol = new Prg_120820();
		
		int ans = sol.solution(40);
		System.out.println(ans);

	}
	
	public int solution(int age) {
        int answer = 2023-age;
        return answer;
    }

}
