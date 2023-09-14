package algorithm.study.dohyun.programmers;
import java.util.PriorityQueue;
public class Prg_42626 {
    public static void main(String[] args){

        Prg_42626 sol = new Prg_42626();

        int[] scoville1 = { 1,2,3,9,10,12 };
        int K = 7;
        int ans = sol.solution(scoville1, K);
        System.out.println(ans);
    }
    public int solution(int[] scoville , int K){

        int ans = 0;

        PriorityQueue <Integer> heap  = new PriorityQueue<>();
        for(int i: scoville )
            heap.add(i);

        while( heap.peek() < K && heap.size() > 1){

            heap.add( heap.poll() + 2*heap.poll() );
            ans++;

        }
        if( heap.size() <= 1 && heap.peek() < K)
            return -1;

        return ans;
    }
}
