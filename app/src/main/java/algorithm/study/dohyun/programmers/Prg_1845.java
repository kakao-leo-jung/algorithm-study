package algorithm.study.dohyun.programmers;
import java.util.*;
public class Prg_1845 {
    public static void main(String[] args){
        Prg_1845 sol = new Prg_1845();

        int[] nums1 = { 3,1,2,3 };
        int ans = sol.solution(nums1);
        System.out.println(ans);

        int[] nums2 = { 3,3,3,2,2,4 };
        int ans2 = sol.solution(nums2);
        System.out.println(ans2);
    }
    public int solution(int[] nums){
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i,0) +1);
        }
        if(hm.size() <= nums.length/2)
            return hm.size();
        return nums.length/2;

    }
}