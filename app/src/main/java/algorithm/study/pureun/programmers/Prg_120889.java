package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 삼각형의 완성조건(1)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */
public class Prg_120889 {

	public static void main(String[] args) {
		Prg_120889 sol = new Prg_120889();
		int[] num = new int[] { 3, 6, 2 };
		int ans = sol.solution(num);

		System.out.println(ans);
	}

	public int solution(int[] sides) {
		int answer = 0;

		int a = sides[0];
		int b = sides[1];
		int c = sides[2];

		if (a > b && a > c) {
			if (a < b + c) {
				answer = 1;
			} else {
				answer = 2;
			}
		} else if (b > a && b > c) {
			if (b < a + c) {
				answer = 1;
			} else {
				answer = 2;
			}
		} else {
			if (c < a + b) {
				answer = 1;
			} else {
				answer = 2;
			}
		}

		return answer;
	}
	//if -else if -else 로 영역을 확실하게 구분할것
	//제대로 구분하지 않으니까 계속 오류가 생김(if남발하지말것)

}
