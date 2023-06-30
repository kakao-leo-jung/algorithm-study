package algorithm.study.devjk_sample.leetcode;

import java.util.Arrays;

/**
 * 리트코드 - Max Number of K-Sum Pairs
 *
 * @link https://leetcode.com/problems/max-number-of-k-sum-pairs
 */
public class Let_1679 {

  public static void main(String[] args) {
    Let_1679 sol = new Let_1679();
    System.out.println(sol.maxOperations(new int[] {1, 2, 3, 4}, 5));
    System.out.println(sol.maxOperations(new int[] {3, 1, 3, 4, 3}, 6));
  }

  public int maxOperations(int[] nums, int k) {
    int ans = 0;
    nums = Arrays.stream(nums).sorted().toArray();
    int p1 = 0;
    int p2 = nums.length - 1;

    while (p1 < p2) {
      int cur = nums[p1] + nums[p2];
      if (cur > k) {
        p2--;
      } else if (cur < k) {
        p1++;
      } else {
        // equal
        ans++;
        p2--;
        p1++;
      }
    }
    return ans;
  }
}
