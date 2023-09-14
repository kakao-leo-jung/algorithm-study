package algorithm.study.dohyun.programmers;
import java.util.*;
import java.util.Map;
public class Prg_92334 {
    public static void main(String[] args){
        Prg_92334 sol = new Prg_92334();

        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        String[] report = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
        int k =2;

        int[] ans = sol.solution(id_list,report,k);
        for(int i:ans)
            System.out.print(i+" ");
        System.out.println();

        String[] id_list2 = {"con", "ryan" };
        String[] report2 = { "ryan con", "ryan con", "ryan con", "ryan con" };
        int k2 =3;

        int[] ans2 = sol.solution(id_list2,report2,k2);
        for(int i:ans2)
            System.out.print(i+" ");
    }
    public int[] solution(String[] id_list, String[] report, int k){

        int[] num = new int[id_list.length];

        HashMap<String,Integer> reportmap = new HashMap<>();
        for( int i=0; i< id_list.length; i++){
            String str = report[i];

            // manmap.put(str.split(" ")[0], str.split(" ")[1]);
            reportmap.put(str.split(" ")[1], reportmap.getOrDefault( str.split(" ")[1] ,0 )+1);

        }
        // reportmap의 키값이 k 보다 크거나 같으면 value값이 정지됨
        for( Map.Entry<String,Integer> entrySet : reportmap.entrySet() ){
            if( entrySet.getValue() >= k){

                for( int i =0 ; i< report.length; i++){
                    String name = entrySet.getKey();
                    System.out.println(name + " "+ report[i].split(" ")[1] );
                    if( name.equals( report[i].split(" ")[1] ) ) {
                        for(int j =0; j<id_list.length; j++) {
                            if(id_list[j].equals(report[i].split(" ")[0]))
                                num[j]++;
                        }
                    }
                }
            }
        }

       return num;
    }
}
