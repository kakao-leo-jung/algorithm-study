package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42586 {
    public static void main(String[] args){

        Prg_42586 sol = new Prg_42586();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        ArrayList<Integer> ans = sol.solution(progresses, speeds);
        for(int i:ans)
            System.out.print(i+" ");
        System.out.println();

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        ArrayList<Integer> ans2 = sol.solution(progresses2, speeds2);
        for(int i:ans2)
            System.out.print(i+" ");
        System.out.println();

    }
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new LinkedList<>();
        for(int i=0; i<speeds.length ; i++){
            int day = 0;
            while(progresses[i] < 100){
                day ++;
                progresses[i] += speeds[i];
            }
            days.offer(day);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int idx =0;
        while(!days.isEmpty()){

            int tmp = days.poll();
            int cnt = 1;

            while(!days.isEmpty() && days.peek() <= tmp){
                days.poll();
                cnt++;
            }

            ans.add(cnt);
            idx ++;

        }

        return ans;

    }}