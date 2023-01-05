package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 양꼬치
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */
public class Prg_120830 {

	public static void main(String[] args) {
		Prg_120830 sol = new Prg_120830();
		
		int ans = sol.solution(10, 3);
		System.out.println(ans);

	}
	
	public int solution(int n, int k) {
        int answer = 0;
        
        int service = k-(n/10);
        int pay = (n*12000) + (service*2000);
        
        answer = pay;
        return answer;
    }

}
