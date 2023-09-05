package algorithm.study.dohyun.boj;
import java.util.*;
import java.util.Stack;
import java.io.*;
public class Boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st ;


        for(int i=0; i<T; i++){
            Stack<String> stk = new Stack<>();
            String str = br.readLine();
            for(int j=0; j< str.length(); j++) {
                char tmp = str.charAt(j);

                if ( !stk.isEmpty() ) {
                    if ( (tmp == ')' ) && stk.peek().equals("(") )  {
                        stk.pop();
                    }
                    else stk.push(Character.toString(tmp));
                }else
                    stk.push(Character.toString(tmp));
            }

            if( stk.isEmpty() )   System.out.println("YES");
            else System.out.println("NO");

        }


    }
}
