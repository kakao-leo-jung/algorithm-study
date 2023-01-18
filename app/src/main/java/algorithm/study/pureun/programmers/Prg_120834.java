package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 외계행성의 나이
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120834
 */
public class Prg_120834 {

	public static void main(String[] args) {
		Prg_120834 sol = new Prg_120834();
		String ans = sol.solution(23);
		System.out.println(ans);

	}

	public String solution(int age) {
		String answer = "";
		String tg = String.valueOf(age);

		char[] ch = new char[tg.length()];
		for (int i = 0; i < tg.length(); i++) {
			if (tg.charAt(i) == 48) {
				ch[i] = 97;
			} else if (tg.charAt(i) == 49) {
				ch[i] = 98;
			} else if (tg.charAt(i) == 50) {
				ch[i] = 99;
			} else if (tg.charAt(i) == 51) {
				ch[i] = 100;
			} else if (tg.charAt(i) == 52) {
				ch[i] = 101;
			} else if (tg.charAt(i) == 53) {
				ch[i] = 102;
			} else if (tg.charAt(i) == 54) {
				ch[i] = 103;
			} else if (tg.charAt(i) == 55) {
				ch[i] = 104;
			} else if (tg.charAt(i) == 56) {
				ch[i] = 105;
			} else if (tg.charAt(i) == 57) {
				ch[i] = 106;
			}
		}

		answer = String.valueOf(ch);
		return answer;
	}

}
