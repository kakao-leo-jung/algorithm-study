package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - House Robbe2 ii
 *
 * @link https://leetcode.com/problems/house-robber
 */
public class Let_213 {

  public static void main(String[] args) {
    Let_213 sol = new Let_213();
    System.out.println(sol.rob(new int[] {2, 3, 2}));
    System.out.println(sol.rob(new int[] {1, 2, 3, 1}));
    System.out.println(sol.rob(new int[] {1, 2, 3}));
  }

  public int rob(int[] nums) {
    int[] dp1 = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        dp1[i] = nums[i];
        continue;
      }
      if (i == 1) {
        dp1[i] = Math.max(nums[i], dp1[i - 1]);
        continue;
      }
      if (i == nums.length - 1) {
        dp1[i] = Math.max(dp1[i - 2], dp1[i - 1]);
        continue;
      }
      dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
    }
    int dp1Result = dp1[nums.length - 1];

    int[] dp2 = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        dp2[i] = 0;
        continue;
      }
      if (i == 1) {
        dp2[i] = Math.max(nums[i], dp2[i - 1]);
        continue;
      }
      dp2[i] = Math.max(dp2[i - 2] + nums[i], dp2[i - 1]);
    }
    int dp2Result = dp2[nums.length - 1];

    return Math.max(dp1Result, dp2Result);
  }
}
