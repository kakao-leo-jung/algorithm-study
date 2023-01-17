package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 암호 해독
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120892
 */
public class Prg_120892 {

	public static void main(String[] args) {
		Prg_120892 sol = new Prg_120892();
		String ans = sol.solution("dfjardstddetckdaccccdegk", 4);
		System.out.println(ans);

	}

	public String solution(String cipher, int code) {
		String answer = "";
		char[] tg = cipher.toCharArray();
		char[] ch = new char[cipher.length()];
		int index = 0;
		for (int i = 0; i < cipher.length() / code; i++) {
			ch[i] = tg[((i+1) * code) - 1];
			index++;
		}
		char[] ans = new char[index];

		for (int i = 0; i < index; i++) {
			ans[i] = ch[i];
		}
		answer = String.valueOf(ans);
		return answer;
	}

}
