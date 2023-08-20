// 해시 - 완주하지 못한 선수
package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42576 {
    public static void main(String[] args){
        Prg_42576 sol = new Prg_42576();

        String[] participant1 = { "leo", "kiki", "eden" };
        String[] completion1 = { "eden", "kiki" };
        String ans = sol.solution(participant1, completion1);
        System.out.println(ans);

        String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
        String ans2 = sol.solution(participant2, completion2);
        System.out.println(ans2);

    }
    public String solution(String[] participant, String[] completion ){
        String ans = "";
        HashMap<String,Integer> hash  = new HashMap<>();
        for(String i : participant)
            hash.put(i, hash.getOrDefault(i,0)+1 );

        for(String i: completion )
            hash.put(i,hash.get(i) -1);

        for( Map.Entry<String, Integer> tmp : hash.entrySet() ){

            if(tmp.getValue() == 1)
                ans = tmp.getKey();
        }
        return ans;

    }
}
