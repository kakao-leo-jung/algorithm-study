package algorithm.study.dohyun.programmers;
import java.util.*;

public class Prg_68644 {
    public static void main(String[] args){

        Prg_68644 sol = new Prg_68644();
        int[] nums = {2,1,3,4,1};
        int[] ans = sol.solution(nums);
        for(int i:ans)
            System.out.print(i +" ");
        System.out.println();

        int[] nums2 = {5,0,2,7};
        int[] ans2 = sol.solution(nums2);
        for(int i:ans2)
            System.out.print(i +" ");
        System.out.println();
    }

    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);//{1,1,2,3,4}
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<numbers.length;i++){
            for(int j= 1;j<numbers.length;j++){
                if(i == j)
                    break;
                if(!arr.contains(numbers[i]+ numbers[j]))
                    arr.add(numbers[i] + numbers[j]);
            }
        }
        // arraylist sorting 을 어떻게 했지
        Collections.sort(arr);
        int[] ans = new int[arr.size()];
        for(int i=0; i<arr.size(); i++)
            ans[i] = arr.get(i);
        return ans;


    }
}
