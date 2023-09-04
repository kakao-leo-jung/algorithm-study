package algorithm.study.dohyun.programmers;
import java.util.*;
import java.util.Map.Entry;

public class Prg_42579 {

    public static void main(String[] args){
        Prg_42579 sol = new Prg_42579();

        String[] genres = {"classic", "pop", "classic", "classic", "pop" };
        int[] plays = { 500, 600, 150, 800, 2500 };
        ArrayList<Integer> ans = sol.solution(genres, plays );
        for(Integer i : ans)
            System.out.print(i+" ");

    }
    public ArrayList<Integer> solution(String[] genres, int[] plays) {


        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String,Integer> hm = new HashMap<>();

        for( int i = 0; i<plays.length; i++)
            hm.put( genres[i] , hm.getOrDefault( genres[i],0) + plays[i] );

        List< Map.Entry< String , Integer >> maplist = new LinkedList<>(hm.entrySet());
        Collections.sort(maplist, new Comparator<Entry<String,Integer>>(){
            public int compare(Entry<String, Integer> o1, Entry<String,Integer> o2 ){
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for( Map.Entry<String,Integer> entry : maplist ){

            HashMap<Integer, Integer > tmp = new HashMap<>();
            for(int j=0 ; j < plays.length; j++){

                if( entry.getKey().equals( genres[j] ))
                    tmp.put(j,plays[j]);

            }
            List< Entry< Integer , Integer >> tmpmap = new ArrayList<>(tmp.entrySet());
            Collections.sort( tmpmap, new Comparator<Entry<Integer,Integer>>(){
                public int compare(Entry<Integer, Integer> o1, Entry<Integer,Integer> o2 ){
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            if(tmpmap.size() <= 1)
                ans.add(tmpmap.get(0).getKey());
            else{
                ans.add(tmpmap.get(0).getKey());
                ans.add(tmpmap.get(1).getKey());
            }

        }
        return ans;
    }
}
