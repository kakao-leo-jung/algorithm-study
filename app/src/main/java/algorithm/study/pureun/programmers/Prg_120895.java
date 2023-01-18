package algorithm.study.pureun.programmers;

/**
 * 프로그래머스 - 인덱스 바꾸기
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */
public class Prg_120895 {

	public static void main(String[] args) {
		Prg_120895 sol = new Prg_120895();
		String ans = sol.solution("hello", 1, 2);
		System.out.println(ans);

	}
	
	public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        char temp =0;
        temp = ch[num1];
        ch[num1] = ch[num2];
        ch[num2] = temp;
        
        answer = String.valueOf(ch);
        
        return answer;
    }

}
