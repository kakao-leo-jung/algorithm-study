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

    }

    public boolean solution(String s){

        boolean answer = true;

        Queue<String> q = new LinkedList<>();

        if(s.charAt(0) == ')')
            return false;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==('('))
                q.offer("(");

            if(s.charAt(i) == (')'))
                q.poll();

        }

        if(!q.isEmpty())
            answer = false;

        return answer;
    }
}