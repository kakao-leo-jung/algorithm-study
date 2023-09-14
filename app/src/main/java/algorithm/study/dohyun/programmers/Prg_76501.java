package algorithm.study.dohyun.programmers;

import java.util.Arrays;

public class Prg_76501 {
    public static void main(String[] args) {
        Prg_76501 sol = new Prg_76501();
        int[] num = {4,7,12};
        boolean[] signs = {true,false,true};
        int ans = sol.solution(num,signs);
        System.out.println(ans);

        int[] num2 = {1,2,3};
        boolean[] signs2 = {false,false,true};
        int ans2 = sol.solution(num2,signs2);
        System.out.println(ans2);
    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i< absolutes.length ; i++){
            answer += signs[i] ? absolutes[i]:-1*absolutes[i];
        }
        return answer;
    }
}

