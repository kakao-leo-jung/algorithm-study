package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42584 {

    public static void main(String[] args){

        Prg_42584 sol = new Prg_42584();
        int[] prices1 = {1, 2, 3, 2, 3};
        int[] ans = sol.solution(prices1);
        for(int i: ans)
            System.out.print(i);
        System.out.println();

    }
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            for(int j= i+1; j<prices.length ; j++){
                answer[i]++;
                if( prices[i] > prices[j] ) break;

            }
        }

        return answer;
    }
}