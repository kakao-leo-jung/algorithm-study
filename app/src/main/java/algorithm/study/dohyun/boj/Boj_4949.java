package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
import java.util.Stack;
public class Boj_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.charAt(0) == '.')    break; // 마지막 문장이면 아웃s

            sb.append(solution(str)).append("\n");

        }
        System.out.println(sb);
    }
    private static String solution(String str){

        Stack<Character> stk = new Stack<>();

        str = str.replace(" ","");
        for(int i=0; i< str.length() ; i++){

            char tmp = str.charAt(i);

            if( tmp == '[' || tmp =='(')
                stk.push(tmp);

            if(tmp == ')' ) {
                if( stk.isEmpty()  || stk.peek() != '(') {
                    return "no";
                }
                else stk.pop();
            }


            if(tmp == ']') {
                if( stk.isEmpty() || stk.peek() !='[' ) {
                    return "no";
                }
                else stk.pop();
            }

        }

        if( stk.isEmpty() ) return "yes";
        else    return "no";

    }
}
