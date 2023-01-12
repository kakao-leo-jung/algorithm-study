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
	        char[] src = new char[] {'a','e','i','o','u'};
	        char[] str = my_string.toCharArray();
	        
	        int index =0;
	        char[] sam = new char[my_string.length()];
	        
	        for(int i =0; i<my_string.length(); i++) {
	        	for(int s = 0; s <src.length; s++) {
	        		if(str[i] != src[s]) {
	        			sam[index] = str[i];
	        			
	        		} else if(str[i] == src[s]) {
	        			index--;
	        			
	        		}
	        	}
	        	index++;
	        }
	        char[] ans = new char[index];
	        
	        for(int put =0; put<ans.length; put++) {
	        	ans[put] = sam[put];
	        }
	        
	        answer = String.valueOf(ans);
	        
	        return answer;
	    }

}
