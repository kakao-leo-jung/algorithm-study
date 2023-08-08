package algorithm.study.dohyun.programmers;
import java.util.*;

public class Prg_150370 {
    public static void main(String[] args){

        Prg_150370 sol = new Prg_150370();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int[] ans = sol.solution(today,terms,privacies);
        for(int i: ans)
            System.out.print(i+" ");
        System.out.println();

        String today2 = "2020.01.01";
        String[] terms2 = {"Z 3", "D 5"};
        String[] privacies2 = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};

        int[] ans2 = sol.solution(today2,terms2,privacies2);
        for(int i: ans2)
            System.out.print(i+" ");
        System.out.println();

    }
    private static int change(String day){

        String[] nday = day.split("[.]");
        int[] ans = new int[3];
        for(int i =0; i<3;i++)
            ans[i] = Integer.parseInt(nday[i]);
        int n = ans[0]*12*28 + ans[1]*28 + ans[2];
        return n;
    }

    public static int[] solution(String today, String[] terms , String[] privacies){

        ArrayList<Integer> ans = new ArrayList<>();
        //terms 를 key , value값이 있는 HashMap으로 정리함.
        HashMap<String,String> termmap = new HashMap<>();
        for(String term: terms){
            String[] tmp = term.split(" ");
            termmap.put(tmp[0], tmp[1]);
        }
        int itoday = change(today);

        for(int i=0; i<privacies.length; i++){
            String[] tmp = privacies[i].split(" ");
            int year = Integer.parseInt(tmp[0].split("[.]")[0]);
            int month = Integer.parseInt(tmp[0].split("[.]")[1]);
            int day = Integer.parseInt(tmp[0].split("[.]")[2]);

            month = month + Integer.parseInt(termmap.get(tmp[1]));
            day = day -1;

            if(day == 0) {
                day = 28;
                month = month -1;
            }

            if(month > 12) {
                month = month - 12;
                year = year + 1;
            }
            if(month == 0){
                month = 12;
                year = year-1;
            }
            int privs = year*28*12 + month*28 + day;
            if(itoday > privs )
                ans.add(i+1);

        }
        int[] sol = new int[ans.size()];
        for(int i = 0; i<ans.size(); i++)
            sol[i] = ans.get(i);
        return sol;
    }
}
