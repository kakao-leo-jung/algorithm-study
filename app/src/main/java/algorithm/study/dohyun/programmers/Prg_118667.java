package algorithm.study.dohyun.programmers;
import org.jetbrains.annotations.NotNull;

import java.util.*;
public class Prg_118667 {
    public static void main(String[] args){

        Prg_118667 sol = new Prg_118667();
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};

        int result = sol.solution(queue1,queue2);
        System.out.println(result);
    }
    public int solution(int[] queue1,int[] queue2){
        Queue<Long> q1 = new LinkedList<>();
        Queue<Long> q2 = new LinkedList<>();

        long q1sum = sum(queue1);
        long q2sum = sum(queue2);

        for( int i=0; i< queue1.length ; i++){
            q1.add((long)queue1[i]);
            q2.add((long)queue2[i]);

        }

        if( (q1sum+q2sum) % 2 != 0)   return -1;
        long half = (q1sum+q2sum) / 2 ;
        int ans = 0;

        while( q1sum != half ){

            if( ans > (queue1.length + queue2.length) * 2  ){
                return -1;
            }

            if ( q1sum < half ){

                q1sum += q2.peek();
                q1.add(q2.poll());

            }
            else {
                q1sum -= q1.peek();
                q2.add(q1.poll());

            }

            ans++;

        }


        return ans;
    }
    public long sum(int[] q){
        long sum =0;
        for( int i: q )
            sum += (long)i;
        return sum;

    }
}
