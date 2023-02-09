package algorithm.study.dohyun.programmers;

import java.util.Arrays;

public class Prg_120809 {

	public static void main(String[] args) {
		Prg_120809 sol = new Prg_120809();
		int[] num1 = new int[] {1,2,3,4,5};
		int[] ans1 = sol.solution(num1);
		System.out.println(Arrays.toString(ans1));
		
		int[] num2 = new int[] {1, 2, 100, -99, 1, 2, 3};
		int[] ans2 = sol.solution(num2);
		System.out.println(Arrays.toString(ans2));

	}
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for(int i = 0; i<numbers.length;i++) {
			answer[i] = numbers[i] *2;
		}
		return answer;
	}

}
