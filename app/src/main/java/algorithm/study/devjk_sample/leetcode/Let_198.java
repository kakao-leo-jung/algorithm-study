package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - House Robber
 *
 * @link https://leetcode.com/problems/house-robber
 */
public class Let_198 {

  public static void main(String[] args) {
    Let_198 sol = new Let_198();
    System.out.println(sol.rob(new int[] {2, 7, 9, 3, 1}));
  }

  public int rob(int[] nums) {
    int[] dp = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        dp[i] = nums[i];
        continue;
      }
      if (i == 1) {
        dp[i] = Math.max(nums[i], dp[i - 1]);
        continue;
      }
      dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
    }
    return dp[nums.length - 1];
  }
}
