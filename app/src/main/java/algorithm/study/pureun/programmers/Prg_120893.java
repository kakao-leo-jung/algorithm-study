package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 대문자와 소문자
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */
public class Prg_120893 {

	public static void main(String[] args) {
		Prg_120893 sol = new Prg_120893();
		String ans = sol.solution("cccCCC");
		System.out.println(ans);

	}

	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			if (my_string.charAt(i) >= 'a') {
				answer += (char) (my_string.charAt(i) - 32);
			} else
				answer += (char) (my_string.charAt(i) + 32);
		}

		return answer;
	}
	//char값은 아래처럼 대문자소문자로 변형할 수 없다 왜냐? 유니코드니까 숫자값으로 나온다
	//즉 내가원하는대로 할려면 유니코드로 범위를 잡아서 형변환을 해야한다.
	/*char[] ch = my_string.toCharArray();
		char ch2;

		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch2 = ch[i];
				Character.toLowerCase(ch2);
				ch[i] = ch2;

			} else if (Character.isLowerCase(ch[i])) {
				ch2 = ch[i];
				Character.toUpperCase(ch2);
				ch[i] = ch2;

			}
		}

		answer = String.valueOf(ch);
	 *  
	 */

}
