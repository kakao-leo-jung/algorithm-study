package algorithm.study.dohyun.boj;
import java.util.*;
import java.io.*;
import java.util.Stack;
public class Boj_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        while(true){
            String str = br.readLine();
            Stack<String> stk = new Stack<>();

            if(str.charAt(0) == '.')    break; // 마지막 문장이면 아웃

            str = str.replace(" ","");


            for(int i=0; i< str.length() ; i++){
                char tmp = str.charAt(i);

                if(tmp == '[') stk.push(Character.toString(tmp));
                else if(tmp == '(') stk.push(Character.toString(tmp));
                else if(tmp == ')'){
                    if( stk.isEmpty() )
                        stk.push(Character.toString(tmp));
                    else if(stk.peek().equals("("))  stk.pop();
                    else stk.push(Character.toString(tmp));
                }
                else if(tmp == ']'){
                    if( stk.isEmpty() )
                        stk.push(Character.toString(tmp));
                    else if(stk.peek().equals("["))  stk.pop();
                    else stk.push(Character.toString(tmp));
                }
            }
            if( stk.isEmpty() ) System.out.println("yes");
            else System.out.println("no");


        }



    }
}
