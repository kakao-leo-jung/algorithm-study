package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 문자열안에 문자열
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class Prg_120908 {

	public static void main(String[] args) {
		Prg_120908 sol = new Prg_120908();
		int ans = sol.solution("ab6CDE443fgknknkh22iJKlmn1o", "6CD");
		System.out.println(ans);

	}

	public int solution(String str1, String str2) {
		int answer = 0;
		
		if(str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 2;
		}

		return answer;
	}

	/*public int solution(String str1, String str2) {
		int answer = 0;

		for (int i = 0; i < str1.length(); i++) {
			String st1 = str1.substring(0, str2.length());

			if (st1.equals(str2)) {
				answer = 1;
			} else {
				char[] ch = str1.toCharArray();
				mix(ch);
				str1 = String.valueOf(ch);
				answer = 2;
			}
		}

		return answer;
	}

	public char[] mix(char[] source) {
		char temp = 0;
		temp = source[0];
		for (int i = 0; i < source.length - 1; i++) {

			source[i] = source[i + 1];
			source[source.length - 1] = temp;
		}

		return source;
	}

	 * 처음에 짯던 무식한 코드
	 * 보통 contains 메소드를 사용했다. 
	 * 혹은 indexof메소드를 사용 위치값으로 알려주는데 위치값을 알려 줄 
	 * 있다는 것 자체가 존재하고 있다는 이야기이기 때문에 사용가능
	 */

}
