package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - n의 배수 고르기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */
import java.util.Arrays;

public class Prg_120905 {

	public static void main(String[] args) {
		Prg_120905 sol= new Prg_120905();
		int[] num = new int[] {4,5,6,7,8,9,10,11,12};
		int[] ans = sol.solution(3, num);
		System.out.println(Arrays.toString(ans));

	}
	
	public int[] solution(int n, int[] numlist) {
        
        int index = 0;
        int[] temp = new int[numlist.length];
        for(int cnt =0; cnt < numlist.length; cnt++) {
        	if(numlist[cnt]%n ==0) {
        		temp[index] = numlist[cnt];
        		index++;
        	}
        }
        int[] answer = new int[index];
        for(int i =0; i < index; i++) {
        	answer[i] = temp[i];
        }
        return answer;
    }

}
