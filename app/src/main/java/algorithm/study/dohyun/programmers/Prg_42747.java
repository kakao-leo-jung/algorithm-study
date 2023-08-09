package algorithm.study.dohyun.programmers;
import java.util.*;

public class Prg_42747 {

    public static void main(String[] args) {
        Prg_42747 sol = new Prg_42747();
        int[] num = {3,0,6,1,5};
        int ans = sol.solution(num);
        System.out.println(ans);

        int[] num2 = {4,4,4};
        int ans2 = sol.solution(num2);
        System.out.println(ans2);
    }

    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i =0; i<citations[citations.length-1];i++){
            int pnum = 0; // h번 이상 인용된 논문 수
            int mnum = 0; // h번 이상 인용되지 않은 논문 수

            for(int j =0; j< citations.length; j++){
                if(i <= citations[j])   pnum++;
                else   mnum++;
            }

            if(pnum >= i && mnum <= i)
                answer = i;

        }
        return answer;
    }
}

