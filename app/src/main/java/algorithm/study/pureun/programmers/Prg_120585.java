package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 머쓱이보다 키 큰 사람
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120585
 */
public class Prg_120585 {

	public static void main(String[] args) {
		Prg_120585 sol = new Prg_120585();
		
		int[] array = new int[] {140, 180, 192, 170};
		int ans = sol.solution(array, 167);
		
		System.out.println(ans);

	}
	
	public int solution(int[] array, int height) {
        int answer = 0;
        int cnt = 0;
        for(int i =0; i<array.length; i++) {
        	if(array[i] > height) {
        		cnt++;
        	}
        }
        
        answer = cnt;
        return answer;
    }

}
