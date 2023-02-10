package algorithm.study.dohyun.programmers;

import java.util.Arrays;


public class Prg_120808 {

	public static void main(String[] args) {
		
		Prg_120808 sol = new Prg_120808();
		
		int[] ans = sol.solution(1,2,3,4);
		System.out.println(Arrays.toString(ans));
	}

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	       
	        
		int denom = denom1*denom2;
	    int num = numer1*denom2 + numer2*denom1;
	        
	      
	    for (int i = num-1; i >1; i-- ) {
	    	if(denom%i==0 && num%i ==0){
	    		denom = denom/i;
	            num = num/i;
	            }
	    	}
	        
	    int[] answer = {num,denom};
	    return answer;
	    }
	        
}



