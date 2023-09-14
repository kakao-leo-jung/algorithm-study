package algorithm.study.dohyun.programmers;

import java.util.Arrays;

public class Prg_120861 {

	public static void main(String[] args) {
		Prg_120861 sol = new Prg_120861();
		String[] str = {"left", "right", "up", "right", "right"};
		int[] board = {11,11};
		int[] ans1 = sol.solution(str,board);
		System.out.println(Arrays.toString(ans1));
		
		String[] str2 = {"down", "down", "down", "down", "down"};
		int[] board2 = {7,9};
		int[] ans2 = sol.solution(str2,board2);
		System.out.println(Arrays.toString(ans2));

	}
	public int[] solution(String[] keyinput, int[] board) {
        int[] ans = new int[2];
        
        for( int i=0; i<keyinput.length;i++){
            if(keyinput[i].equals("up") && ans[1] < (int)board[1]/2 )  ans[1] += 1;
            else if(keyinput[i].equals("down") &&  (-1)*board[1]/2 < ans[1]  ) ans[1] -= 1;
            else if(keyinput[i].equals("left") && (-1)*board[0]/2 < ans[0]) ans[0] -= 1;
            else if (keyinput[i].equals("right") && ans[0] < (int)board[0]/2 ) ans[0] += 1;
        }
        
        
        return ans;
	    }
}

