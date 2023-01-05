package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 각도기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120829
 */
public class Prg_120829 {

	public static void main(String[] args) {
		Prg_120829 sol = new Prg_120829();
		
        int ans = sol.solution(91);
        System.out.println(ans);
	}
	
	public int solution(int angle) {
        int answer = 0;
        
        if(angle < 90) {
        	answer = 1;
        }
        else if(angle == 90) {
        	answer = 2;
        }
        else if(angle < 180) {
        	answer = 3;
        }
        else if(angle == 180) {
        	answer = 4;
        }
        return answer;
    }

}
