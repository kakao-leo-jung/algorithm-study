package algorithm.study.dohyun.boj;
import java.util.*;
import java.util.Queue;
public class Boj_2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> q  = new LinkedList<>();
        for(int i =1; i<= N; i++)
            q.add(i);
        // 1 2 3 4
        int num = 1;
        while( !(q.size() == 1) ){
            if( num % 2 == 1) {
                q.poll();
                num++;
            }else {
                num++;
                q.add(q.poll());
            }
        }
        System.out.println( q.poll() );
    }
}
