package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 배열 두 배 만들기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class Prg_120809 {

	public static void main(String[] args) {
		Prg_120809 sol = new Prg_120809();
		int[] num = new int[] { 1, 2, 3, 4, 5 };
		int[] ans = sol.solution(num);
		System.out.println(Arrays.toString(ans));
	}

	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}

		return answer;
	}
	//answer의 크기지정을 하지않았는데 numbers크기에 맞춰서 넣는다고 하니까 문제가 생김
	//크기에 맞춰서 넣으려면 반드시 크기지정을 해줘야한다.
    
}
