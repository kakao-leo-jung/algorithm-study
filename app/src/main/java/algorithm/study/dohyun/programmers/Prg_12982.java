package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12982 {
    public static void main(String[] args){

        Prg_12982 sol = new Prg_12982();
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int ans = sol.solution(d,budget);
        System.out.println(ans);

        int[] d2 = {2,2,3,3};
        int budget2 = 10;
        int ans2 = sol.solution(d2,budget2);
        System.out.println(ans2);
    }

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int ans = 0;
        for(int i=0; i<d.length;i++){
            budget -= d[i];
            if(budget<0)
                break;
            ans++;
        }

        return ans;
    }
}

