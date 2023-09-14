package algorithm.study.dohyun.programmers;
import java.lang.*;
public class Prg_86491 {
    public static void main(String[] args){
        Prg_86491 sol = new Prg_86491();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int ans = sol.solution(sizes);
        System.out.println(ans);

    }
    public int solution(int[][] sizes){
        int x = 0 , y=0;
        for( int[] size : sizes ){
            int max = Math.max(size[0],size[1]);
            int min = Math.min(size[0], size[1]);
            
            if( max > x )
                x = max;
            if( min > y)
                y = min;
        }
        return x*y;
    }
}
