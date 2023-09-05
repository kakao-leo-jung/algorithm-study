package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_42587 {
    public static void main(String[] args){

        Prg_42587 sol = new Prg_42587();
        int[] priorities1 = {2,1,3,2};
        int location1 = 2;
        int ans = sol.solution(priorities1, location1);
        System.out.println(ans);

        int[] priorities2 = {1,1,9,1,1,1};
        int location2 = 0;
        int ans2 = sol.solution(priorities2, location2);
        System.out.println(ans2);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i:priorities)
            q.add(i);

        while( !q.isEmpty() ){

            int maxval = 0;
            for(Integer i: q){
                if(maxval < i)
                    maxval = i;
            }

            int tmp = q.poll();
            if( tmp == maxval ){

                answer++;
                if(location == 0)
                    break;
                else
                    location--;
            }
            else{

                q.add(tmp);
                if(location == 0)
                    location = q.size() -1;
                else{
                    location--;
                }


            }

        }
        return answer;

    }
}
