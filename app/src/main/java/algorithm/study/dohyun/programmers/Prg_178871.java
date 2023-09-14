package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_178871 {
    public static void main(String[] args){
        Prg_178871 sol = new Prg_178871();

        String[] players = { "mumu", "soe", "poe", "kai", "mine" };
        String[] callings = { "kai", "kai", "mine", "mine" };

        String[] ans = sol.solution(players,callings);
        for(String i:ans)
            System.out.print(i+" ");
        System.out.println();
    }
    public String[] solution( String[] players, String[] callings){

        // hashmap 이름이랑 등수 넣고 이름이 불리면 두 value값 변경
        HashMap<String, Integer> rank = new HashMap<>();
        for(int i=0; i< players.length; i++){
            rank.put(players[i], i);
        }
        for(String win : callings){
            // kai
            int nowrank = rank.get(win); // 3
            String after = players[nowrank -1 ]; // 앞에 가던 사람

            players[nowrank] = after;
            players[nowrank -1 ] = win;


            rank.put(win, nowrank -1 );
            rank.put(after , nowrank );
        }


        return players;
    }
}
