package algorithm.study.dohyun.programmers;
import java.util.List;
import java.util.ArrayList;
public class Prg_42840 {
    public static void main(String[] args){
        Prg_42840 sol = new Prg_42840();

        int[] answer = {1,2,3,4,5};
        List<Integer> ans = sol.solution(answer);
        for(Integer i: ans)
            System.out.print(i+" ");
        System.out.println();
        int[] answer2 = {1,3,2,4,2};
        List<Integer> ans2 = sol.solution(answer2);
        for(Integer i: ans2)
            System.out.print(i+" ");

    }
    public List<Integer> solution (int[] answers){

        int[] mg1 = {1,2,3,4,5};
        int[] mg2 = {2,1,2,3,2,4,2,5};
        int[] mg3 = {3,3,1,1,2,2,4,4,5,5};

        int[] num = {0,0,0};

        for( int i=0 ; i< answers.length; i++){

            if( answers[i] == mg1[i % 5] ) num[0]++;
            if( answers[i] == mg2[ i % 8 ] ) num[1]++;
            if( answers[i] == mg3[ i % 10 ] ) num[2]++;

        }

        List <Integer> list = new ArrayList<>();

        int max = Math.max(num[0], Math.max(num[1], num[2]));

        for(int i= 0; i< 3; i++) {
            if( num[i] == max )
                list.add( (i+1) );
        }

        return list;
    }
}