package algorithm.study.dohyun.programmers;
import java.util.*;
import java.util.List;
public class Prg_92341 {
    public static void main(String[] args){

        Prg_92341 sol = new Prg_92341();

        int[] fees1 = { 180, 5000, 10, 600 };
        String[] records1 = { "05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT",
                "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN",
                "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT" };
        int[] ans = sol.solution(fees1,records1);
        for(int i: ans)
            System.out.print(i+" ");
        System.out.println();


        int[] fees2 = { 120, 0, 60, 591 };
        String[] records2 = { "16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN" };
        int[] ans2 = sol.solution(fees2,records2);
        for(int i: ans2)
            System.out.print(i+" ");
        System.out.println();

    }
    public int[] solution(int[] fees, String[] records){

        HashMap< String,String > parking = new HashMap<>(); // In한 시간 기록
        HashMap<String, Integer> timesum = new HashMap<>(); // 차량별 주차 총 시간

        for(int i = 0; i < records.length ; i++ ){ // 주차별 총 시간을 계산하는 함수

            String[] record = records[i].split(" ");

            if( record[2].equals( "IN") )
                parking.put(record[1],record[0]);

            if( record[2].equals("OUT") ) {
                String[] intime = parking.get(record[1]).split(":");
                String[] outtime = record[0].split(":");
                parking.remove(record[1]);
                int hour = Integer.parseInt(outtime[0]) - Integer.parseInt(intime[0]);
                int min = Integer.parseInt(outtime[1]) - Integer.parseInt(intime[1]);
                if (min < 0) {
                    min = min + 60;
                    hour = hour - 1;
                }
                timesum.put(record[1], timesum.getOrDefault(record[1], 0) + hour * 60 + min);

            }
            // 출차기록이 없을때를 어떻게 기록하지...
        }
        if( !parking.isEmpty() ){
            String tmp = "";
            for( String res : parking.keySet() ){
                tmp  += res;
                String[] intime = parking.get(res).split(":");
                int hour = 23 - Integer.parseInt(intime[0]);
                int min = 59 - Integer.parseInt(intime[1]);
                if(min<0){
                    min += 60;
                    hour -=1 ;
                }
                timesum.put(res,timesum.getOrDefault(res,0)+hour*60 + min);

            }
            parking.remove(tmp);
        }
        int[] answer = new int[timesum.size()];
        int i = 0;
        List<String> keyset = new ArrayList<>(timesum.keySet());
        Collections.sort(keyset);
        for( String tmp : keyset ){


            answer[i] = fees[1]; // 기본시간보더 적다면 기본요금을 넣어줘

            if( timesum.get(tmp) > fees[0] ){
                if( (timesum.get(tmp) -fees[0]) % fees[2] != 0 )
                    answer[i] += (((timesum.get(tmp) -fees[0]) / fees[2])+1) * fees[3];
                else
                    answer[i] += (timesum.get(tmp) - fees[0]) / fees[2] * fees[3];
            }
            i++;

        }


        return answer;
    }

}
