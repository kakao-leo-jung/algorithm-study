package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
import java.util.Queue;
import java.util.Stack;

public class Boj_12789 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> stk = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i= 0; i< N; i++)
            q.add(Integer.parseInt(st.nextToken()));
        int num = 1;
        while( !q.isEmpty() ) {
            if (q.peek().equals(num)) {
                q.poll();
                num++;
            } else if (!stk.isEmpty() && stk.peek().equals(num)) {
                stk.pop();
                num++;
            } else {
                stk.push(q.poll());
            }
        }
        while( ! stk.isEmpty() ){
            if( stk.peek().equals(num) ) {
                stk.pop();
                num++;
            }
            else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");

    }
}
