package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 원소의 길이
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */
public class Prg_120854 {

	public static void main(String[] args) {
		Prg_120854 sol = new Prg_120854();

		String[] n = new String[] { "We", "are", "the", "Wrold!" };
		int[] ans = sol.solution(n);
		System.out.println(Arrays.toString(ans));

	}

	// 배열의 길이를 재는 코드는 배열원소의 길이도 잴수 있음
	// 배열[].length; 원소의길이
	// 배열.length; 배열의 길이 이런식으로

	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}

}
