package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 모음제거
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class Prg_120849 {

	public static void main(String[] args) {
		Prg_120849 sol = new Prg_120849();
		String ans1 = sol.solution("bus");
		String ans2 = sol.solution("nice to meet you");
		System.out.println(ans1);
		System.out.println(ans2);

	}

	public String solution(String my_string) {
		String answer = "";
		String str = my_string.replaceAll("a", "");
		String i = str.replaceAll("i", "");
		String o = i.replaceAll("o", "");
		String u = o.replaceAll("u", "");
		String e = u.replaceAll("e", "");
		answer = e;
		return answer;
	}
	/* 아니 위에게 정답이야? 너무 쓸데없이 복잡하게 생각하려하지마
	 *  answer = my_string.replaceAll("[aeiou]", "");
	 *  저런식으로도 제거가 되는 듯
	 *  
	 * 런타임에러뜸 정답이기는 한듯
	 * char[] src = new char[] { 'a', 'e', 'i', 'o', 'u' };
		char[] str = my_string.toCharArray();

		int index = 0;
		char[] sam = new char[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			for (int s = 0; s < src.length; s++) {
				if (str[i] != src[s]) {
					sam[index] = str[i];

				} else if (str[i] == src[s]) {
					sam[index] = str[i - 1];
					index--;
					break;

				}
			}
			index++;
		}
		char[] ans = new char[index];

		for (int put = 0; put < ans.length; put++) {
			ans[put] = sam[put];
		}

		answer = String.valueOf(ans);
	 */

}
