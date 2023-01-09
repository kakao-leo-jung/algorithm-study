package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 편지
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */
public class Prg_120898 {

	public static void main(String[] args) {
		Prg_120898 sol = new Prg_120898();
		int ans =sol.solution("happy birthday!");
		System.out.println(ans);

	}
	
	public int solution(String message) {
        int answer = message.length()*2;
        return answer;
    }

}
