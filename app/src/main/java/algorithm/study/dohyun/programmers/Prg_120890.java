package algorithm.study.dohyun.programmers;
import java.lang.Math;
import java.util.Arrays;

public class Prg_120890 {

	public static void main(String[] args) {
		Prg_120890 sol = new Prg_120890();
		int[] num1 = {3,10,28};
		int n =20;
		int ans1 = sol.solution(num1,n);
		System.out.println(ans1);
	
		int[] num2 = {10,11,12};
		int n2 =13;
		int ans2 = sol.solution(num2,n2);
		System.out.println(ans2);

	}
    public int solution(int[] array, int n) {
        
        int[] dif = new int[array.length];
        int min =100000000;
        int idx =0;
        
        for(int i=0; i<array.length; i++){
            dif[i] = Math.abs(n-array[i]);
            if(min == dif[i]){
                if(array[idx]<array[i]){
                    continue;
                    
                }else{
                    min = dif[i];
                    idx = i;
                }
            }
            else if(min>dif[i]){
                min = dif[i];
                idx = i;
            }
                
        }
        return array[idx];
        
        
    }

}
