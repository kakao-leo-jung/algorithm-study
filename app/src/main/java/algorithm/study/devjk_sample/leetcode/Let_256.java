package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Paint House
 *
 * @link https://leetcode.com/problems/paint-house
 */
public class Let_256 {

  public static void main(String[] args) {
    Let_256 sol = new Let_256();
    int ans =
        sol.minCost(
            new int[][] {
              {17, 2, 17},
              {16, 16, 5},
              {14, 3, 19}
            });
    System.out.println(ans);
  }

  public int minCost(int[][] costs) {
    int[] dp1 = new int[costs.length];
    int[] dp2 = new int[costs.length];
    int[] dp3 = new int[costs.length];
    for (int i = 0; i < costs.length; i++) {
      if (i == 0) {
        dp1[i] = costs[i][0];
        dp2[i] = costs[i][1];
        dp3[i] = costs[i][2];
        continue;
      }
      dp1[i] = Math.min(dp2[i - 1], dp3[i - 1]) + costs[i][0];
      dp2[i] = Math.min(dp1[i - 1], dp3[i - 1]) + costs[i][1];
      dp3[i] = Math.min(dp1[i - 1], dp2[i - 1]) + costs[i][2];
    }
    return Math.min(dp1[costs.length - 1], Math.min(dp2[costs.length - 1], dp3[costs.length - 1]));
  }
}
