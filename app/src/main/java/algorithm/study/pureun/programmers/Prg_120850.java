package algorithm.study.pureun.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 문자열 정렬하기(1)
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120850
 */
public class Prg_120850 {

	public static void main(String[] args) {
		Prg_120850 sol = new Prg_120850();
		int[] ans = sol.solution("hi12392");
		System.out.println(Arrays.toString(ans));

	}
	
	public int[] solution(String my_string) {
       
        char[] temp = new char[my_string.length()];
        int index = 0;
        for(int i =0; i < my_string.length(); i++) {
        	for(int j = 48; j <=57; j++) {
        		if(my_string.charAt(i) == j) {
        			temp[index] = my_string.charAt(i);
        			index++;
        		}
        	}
        }
        
        char[] tmp = new char[index];
        
        for(int i =0; i < index; i++) {
        	tmp[i] = temp[i];
        }
        
        //정렬이게 아니라 0을기준으로 하는거 였음
        for(int i = 0; i < index; i++) {
        	for(int j =0; j <index; j++) {
        		if(tmp[i] < tmp[j]) {
        			char ch =0;
        			ch = tmp[i];
        			tmp[i] = tmp[j];
        			tmp[j] = ch;
        		}
        	}
        }
        
        String ans = String.valueOf(tmp);
        
        int[] answer = new int[index];
        
        for(int i =0; i < index; i++) {
        	answer[i] = ans.charAt(i) - '0';
        }
        
        return answer;
    }

}
