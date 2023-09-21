package algorithm.study.dohyun.programmers;
import java.util.*;
import java.util.Map.*;
public class Prg_118666 {
    public static void main(String[] args){
        Prg_118666 sol = new Prg_118666();

        String[] survey = { "AN", "CF", "MJ", "RT", "NA" };
        int[] choices = { 5, 3, 2, 7, 5 };
        System.out.println(sol.solution(survey,choices));
    }

    public String solution(String[] survey, int[] choices){

        LinkedHashMap<Character,Integer> score = new LinkedHashMap<>();
        score.put('R',0);
        score.put('T',0);
        score.put('C',0);
        score.put('F',0);
        score.put('J',0);
        score.put('M',0);
        score.put('A',0);
        score.put('N',0);
        // 1234567 별로 점수 넣기도 따로 만들어야지

        for( int i=0; i<survey.length; i++){
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);
            switch( choices[i] ){
                case 1:
                    score.put(first,score.getOrDefault(first,0)+ 3);
                    break;
                case 2:
                    score.put(first,score.getOrDefault(first,0)+ 2);
                    break;
                case 3:
                    score.put(first,score.getOrDefault(first,0)+ 1);
                    break;
                case 5:
                    score.put(second,score.getOrDefault(second,0)+ 1);
                    break;
                case 6:
                    score.put(second,score.getOrDefault(second,0)+ 2);
                    break;
                case 7:
                    score.put(second,score.getOrDefault(second,0)+ 3);
                    break;

            }
        }
        String ans = "";
        Set set = score.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Entry<Character, Integer> entry1 = (Entry)iter.next();
            iter.remove();
            Entry<Character, Integer> entry2 = (Entry)iter.next();
            iter.remove();

            if ( entry1.getValue() < entry2.getValue() )
                ans += entry2.getKey();
            else
                ans += entry1.getKey();
        }

        return ans;

    }


}
