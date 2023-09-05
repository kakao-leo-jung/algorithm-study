package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
import java.util.Stack;
public class Boj_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();

        for(int i=0 ; i< K; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if( num == 0 ) {
                stk.pop();
                continue;
            }
            stk.push(num);
        }
        int answer = 0 ;
        for(Integer i: stk)
            answer+= i;
        System.out.println(answer);
    }
}
