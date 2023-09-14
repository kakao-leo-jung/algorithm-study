package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12909 {
    public static void main(String[] args){

        Prg_12909 sol = new Prg_12909();
        String s = "()()";
        boolean answer = sol.solution(s);
        System.out.println(answer);

        String s2 = "(())()";
        boolean answer2 = sol.solution(s2);
        System.out.println(answer2);

        String s3 = ")()(";
        boolean answer3 = sol.solution(s3);
        System.out.println(answer3);

        String s4 = "())";
        boolean answer4 = sol.solution(s4);
        System.out.println(answer4);

    }

    public boolean solution(String s){

        boolean answer = true;

        Queue<Character> q = new LinkedList<>();


        for(int i=0; i < s.length()  ; i++){
            if (s.charAt(i) == '(' )
                q.offer(s.charAt(i));
            else if( s.charAt(i) == ')' ){
                if( !q.isEmpty() && q.peek() == '(' )
                    q.poll();
                else
                    return false;

            }

        }
        if(!q.isEmpty())
            answer = false;

        return answer;
    }
}