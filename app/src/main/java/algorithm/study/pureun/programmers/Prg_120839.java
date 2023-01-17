package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 가위 바위 보
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120839
 */
public class Prg_120839 {

	public static void main(String[] args) {
		Prg_120839 sol = new Prg_120839();

		String ans = sol.solution("2");
		System.out.println(ans.toString());

	}

	public String solution(String rsp) {
		String answer = "";
		char[] ch = new char[rsp.length()];

		for (int i = 0; i < rsp.length(); i++) {
			if (rsp.charAt(i) == '2') {
				ch[i] = '0';
			} else if (rsp.charAt(i) == '0') {
				ch[i] = '5';
			} else if (rsp.charAt(i) == '5') {
				ch[i] = '2';
			}
		}
		answer = String.valueOf(ch);
		return answer;
	}

}
