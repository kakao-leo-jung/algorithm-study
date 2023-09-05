package algorithm.study.dohyun.programmers;
import java.util.*;

public class Prg_12906 {
    public static void main(String[] args){
        Prg_12906 sol = new Prg_12906();
        int[] arr1 = {1,1,3,3,0,1,1};
        ArrayList<Integer> ans =sol.solution(arr1);

        for(int i : ans )
            System.out.print(i+" ");
        System.out.println();



        int[] arr2 = {4,4,4,3,3};
        ArrayList<Integer> ans2 =sol.solution(arr2);
        for(int i : ans2 )
            System.out.print(i+" ");
        System.out.println();
    }

    public ArrayList<Integer> solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);

        for(int i = 1; i<arr.length;i++){
            if(!(arr[i-1] == arr[i]))
                ans.add(arr[i]);
        }
        return ans;
    }
}

