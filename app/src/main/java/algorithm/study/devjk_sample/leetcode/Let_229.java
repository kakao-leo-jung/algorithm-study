package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 리트코드 - Majority Element II
 *
 * @link https://leetcode.com/problems/majority-element-ii
 */
public class Let_229 {

  public static void main(String[] args){
    Let_229 sol = new Let_229();
    System.out.println(sol.majorityElement(new int[]{3, 2, 3}));
    System.out.println(sol.majorityElement(new int[]{1}));
    System.out.println(sol.majorityElement(new int[]{1, 2}));
    System.out.println(sol.majorityElement(new int[]{2, 2, 1, 3}));
  }

  public List<Integer> majorityElement(int[] nums) {
    List<Integer> list = new ArrayList<>();
    nums = Arrays.stream(nums).sorted().toArray();
    int target = nums.length / 3;
    int cnt = 0;
    int before = nums[0];
    for(int num : nums) {
      if(num == before) {
        cnt++;
      }else {
        if(cnt > target) {
          list.add(before);
        }
        cnt = 1;
      }
      before = num;
    }
    if(cnt > target) {
      list.add(before);
    }
    return list;
  }

}
