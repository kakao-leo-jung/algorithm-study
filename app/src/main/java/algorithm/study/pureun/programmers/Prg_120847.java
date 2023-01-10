package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 최댓값 만들기(1)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120847
 */
public class Prg_120847 {

	public static void main(String[] args) {
		Prg_120847 sol = new Prg_120847();
		int[] num = new int[] { 1, 2, 3, 4, 5 };
		int ans = sol.solution(num);
		System.out.println(ans);

	}

	public int solution(int[] numbers) {
		int answer = 0;
		int max = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (i != j && numbers[i] * numbers[j] > max) {
					max = numbers[i] * numbers[j];
				}
			}
		}
		answer = max;
		return answer;
	}
	//처음에 생각했던 방법은 실패
	//대부분은 정렬을 이용해서 풀었음
	//위에 방법은 전부 곱한 값 자체를 비교한 것
}
