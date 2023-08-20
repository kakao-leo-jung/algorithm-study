package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_81301 {
    public static void main(String[] args){

        Prg_81301 sol = new Prg_81301();
        String s1 = "one4seveneight";
        int result1 = sol.solution(s1);
        System.out.println(result1);

        String s2 = "23four5six7";
        int result2 = sol.solution(s2);
        System.out.println(result2);

    }

    public static int solution(String s){
        HashMap<String,String> numb = new HashMap<String,String>(){{
            put("zero","0");
            put("one","1");
            put("two","2");
            put("three","3");
            put("four","4");
            put("five","5");
            put("six","6");
            put("seven","7");
            put("eight","8");
            put("nine","9");
        }};

        for(String i: numb.keySet())
            s = s.replaceAll(i,numb.get(i));
        return Integer.parseInt(s);
    }
}
