package algorithm.study.dohyun.boj;
import java.util.*;
import java.util.Stack;
import java.io.*;

public class Boj_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        while( N --> 0){
             st = new StringTokenizer(br.readLine());
             int num = Integer.parseInt(st.nextToken());
             if(num == 1){
                 int s = Integer.parseInt(st.nextToken());
                 stk.push(s);
             } else if( num == 2 )
                 sb.append( stk.isEmpty() ? -1 : stk.pop() ).append("\n");
             else if( num == 3 )
                 sb.append( stk.size() ).append("\n");
             else if( num == 4 )
                 sb.append( stk.isEmpty() ? 1 : 0).append("\n");
             else if(  num == 5 )
                 sb.append( stk.isEmpty() ? -1 : stk.peek() ).append("\n");


        }
        System.out.println(sb);
    }
}
