package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_12977 {

    private boolean prime(int num){
        for(int i =2; i<num/2; i++){
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