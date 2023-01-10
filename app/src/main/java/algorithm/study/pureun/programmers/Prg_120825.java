package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 문자 반복 출력하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class Prg_120825 {

	public static void main(String[] args) {
		Prg_120825 sol = new Prg_120825();
		String ans = sol.solution("hello", 3);
		System.out.println(ans.toString());

	}

	public String solution(String my_string, int n) {
		String answer = "";
		char[] str = my_string.toCharArray();

		char[] ch = new char[str.length * n];

		int index = 0;

		for (int i = 0; i < str.length; i++) {
			for (int in = 1; in <= n; in++) {
				ch[index] = str[i];
				index++;
			}
		}
		answer = String.valueOf(ch);
		return answer;
	}
	// String.valueOf를써야지 제대로 변환이됨
	// String에서 char[]는 잘되지만 역으로는 반드시 변환을 해야함

}
