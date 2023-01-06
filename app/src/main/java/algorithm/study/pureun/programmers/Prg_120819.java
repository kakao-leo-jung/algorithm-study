package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 아이스 아메리카노
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */
public class Prg_120819 {

	public static void main(String[] args) {
		Prg_120819 sol = new Prg_120819();
		
		int[] ans = sol.solution(5500);
		System.out.println(Arrays.toString(ans));

	}

	public int[] solution(int money) {
		int[] answer = { money/5500, money%5500};
		
		return answer;
	}

}
