package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 주사위의 개수
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120845
 */
public class Prg_120845 {

	public static void main(String[] args) {
		Prg_120845 sol = new Prg_120845();
		int[] num = new int[] {1,1,1};
		int ans = sol.solution(num, 1);
		System.out.println(ans);
	}
	
	public int solution(int[] box, int n) {
        int answer = 1;
        
        for(int i = 0; i < box.length; i++) {
        	answer = answer*(box[i]/n);
        }
        return answer;
    }

}
