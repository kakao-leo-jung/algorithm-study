package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 특정 문자 제거하기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120826
 */
public class Prg_120826 {

	public static void main(String[] args) {
		Prg_120826 sol = new Prg_120826();
		String ans = sol.solution("abcdef", "f");
		System.out.println(ans);

	}

	public String solution(String my_string, String letter) {
		String answer = my_string.replace(letter, "");
		return answer;
	}
	//replace는 제거도된다 변환뿐만 아니라
		/* String answer = "";
	        char c = letter.charAt(0);
	        for(int i=0; i<my_string.length(); i++){
	            char temp = my_string.charAt(i);
	            if(temp==c) continue;
	            answer+=temp;
	        }
	        return answer;
	        처음 생각한 방법의 정답: 형변환과 continue의 사용법이 잘못되었던듯 
	        char끼리 더하면 string?
		 */

}
