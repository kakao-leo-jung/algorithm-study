package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42862 {
    public static void main(String[] args){

        Prg_42862 sol = new Prg_42862();
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        System.out.println(sol.solution(n,lost,reserve));
        System.out.println(sol.solution(5,new int[] {2,4}, new int[] {3}));
    }
    public int solution(int n, int[] lost, int[] reserve){

        ArrayList<Integer> lostlist = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int i: lost)
            lostlist.add(i);
        for( int i = 0; i< reserve.length ; i++){
            if( lostlist.contains(reserve[i]) ){
                lostlist.remove(lostlist.indexOf(reserve[i]));
                reserve[i] = -1;
            }
        }

        for( int i = 0; i< reserve.length; i++){
            int man = reserve[i];

            if( lostlist.contains(man-1))
                lostlist.remove(lostlist.indexOf(man-1));
            else if( lostlist.contains( man+1 ) )
                lostlist.remove(lostlist.indexOf(man+1));

        }

        return n - lostlist.size() ;
    }
}