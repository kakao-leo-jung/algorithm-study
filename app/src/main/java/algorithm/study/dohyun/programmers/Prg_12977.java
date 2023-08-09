package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12977 {
    public static void main(String[] args){

        Prg_12977 sol = new Prg_12977();
        int[] nums = {1,2,3,4};
        int ans = sol.solution(nums);
        System.out.println(ans);

        int[] nums2 = {1,2,7,6,4};
        int ans2 = sol.solution(nums2);
        System.out.println(ans2);

    }
    private boolean prime(int num){
        for(int i =2; i<num; i++){
            if(num % i == 0 )
                return false;
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            for(int j = 0; j<nums.length;j++){
                if(i == j)
                    break;
                for(int k =0;k<nums.length;k++){
                    if(i ==k || j == k)
                        break;
                    arr.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        for(int i=0; i< arr.size(); i++){
            if(prime(arr.get(i)))
                answer++;
        }

        return answer;
    }
}