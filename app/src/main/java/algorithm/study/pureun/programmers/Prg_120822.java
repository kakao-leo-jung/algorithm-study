package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 문자열 뒤집기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */
public class Prg_120822 {

	public static void main(String[] args) {
		Prg_120822 sol = new Prg_120822();

		String ans = sol.solution("jaron");
		System.out.println(ans);

	}
	
    // String타입을 char로 변환하면 한글자씩의 배열로 변환되나봄
	// char = 문자1개를 배열로하면 ==String이지 
	public String solution(String my_string) {
		String answer = "";
		
		char[] ch = new char[my_string.length()];
		for(int i = 0; i < my_string.length(); i++) {
			ch[i] = my_string.charAt(my_string.length()-1-i);
		}
		String str = new String(ch);
		answer = str;
		
		return answer;
	}

}
