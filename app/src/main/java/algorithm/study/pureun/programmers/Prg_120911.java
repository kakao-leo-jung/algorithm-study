package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 문자열 정렬하기 (2)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */
public class Prg_120911 {

	public static void main(String[] args) {
		Prg_120911 sol = new Prg_120911();
		String ans = sol.solution("Bcad");
		System.out.println(ans);

	}

	public String solution(String my_string) {
		String answer = "";
		char[] ch = my_string.toCharArray();

		// 소문자로 바꾸기
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] < 91) {
				ch[i] += 32;
			}
		}

		// 알파벳 순서대로 정렬
		for (int j = 0; j < ch.length; j++) {
			for (int i = 0; i < ch.length-1; i++) {
				if (ch[i] > ch[i+1]) {
					char temp = 0;
					temp = ch[i];
					ch[i] = ch[i+1];
					ch[i+1] = temp;
				}
			}
		}

		answer = String.valueOf(ch);

		return answer;
	}

}
