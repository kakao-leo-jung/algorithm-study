package algorithm.study.dohyun.programmers;
import java.util.*;
import java.util.HashMap;
public class Prg_42578 {
    public static void main(String[] args){
        Prg_42578 sol = new Prg_42578();

        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = sol.solution(clothes1);
        System.out.println(answer);


        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}};
        int answer2 = sol.solution(clothes2);
        System.out.println(answer2);

    }

    public int solution(String[][] clothes ){

        int ans = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        for( int i =0 ;i<clothes.length; i++)
            hm.put( clothes[i][1] , hm.getOrDefault(clothes[i][1] , 0) +1 );

        Iterator <Integer> iter = hm.values().iterator();
        while( iter.hasNext() ){
            ans *= iter.next()+1 ;
        }

        return ans -1 ;
    }
}
