package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42748 {

	public static void main(String[] args) {
		Prg_42748 sol = new Prg_42748();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] ans1 = sol.solution(array, commands);
		System.out.println(Arrays.toString(ans1));

	}

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i< commands.length; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            
            int n=0;
            int[] tmp = new int[b-a+1];
            for(int t =a-1; t<b ; t++)		tmp[n++] = array[t];
    
            Arrays.sort(tmp);
            answer[i] = tmp[c-1];
        }
        
        
        return answer;
    }
}

