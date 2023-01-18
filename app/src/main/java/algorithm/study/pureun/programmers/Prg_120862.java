package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 최댓값 만들기(2)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */
public class Prg_120862 {

	public static void main(String[] args) {
		Prg_120862 sol = new Prg_120862();
		int[] num = new int[] { 1, 2, -3, 4, -5 };
		int ans = sol.solution(num);
		System.out.println(ans);

	}

	public int solution(int[] numbers) {

		int answer = 0;

		Arrays.sort(numbers);

		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		if (num1 < num2) {
			answer = num2;
		} else {
			answer = num1;
		}

		return answer;
	}
	/* 내답안은 7번케이스에서 실패가뜸 이유는 알 수 없음 
	 * 위의 답안은 음수의 곲을 생각해서 정렬후 위아래를 곱하고 비교하였음
	 * int answer = 0;
      int max = 0;
       for(int i = 0; i <numbers.length; i++) {
       	for(int j = i+1; j<numbers.length; j++) {       		if(numbers[i]*numbers[j] > max) {
       			max = numbers[i]*numbers[j];
      		}
    	}
      }      answer = max;
      return answer;
	 * 
	 */

}
