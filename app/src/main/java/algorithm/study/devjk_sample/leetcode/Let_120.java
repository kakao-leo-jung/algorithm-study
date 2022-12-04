package algorithm.study.devjk_sample.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 리트코드 -Triangle
 *
 * @link https://leetcode.com/problems/triangle
 */
public class Let_120 {

  public static void main(String[] args) {
    Let_120 sol = new Let_120();
    int ans1 =
        sol.minimumTotal(
            Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3)));
    int ans2 = sol.minimumTotal(Arrays.asList(Arrays.asList(-10)));
    System.out.println(ans1); // expected 11
    System.out.println(ans2); // expected -10
  }

  public int minimumTotal(List<List<Integer>> triangle) {
    int size = triangle.size();
    int[][] dp = setup(size);
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < i + 1; j++) {
        dp[i][j] = findMinParent(dp, i, j) + triangle.get(i).get(j);
      }
    }
    return Arrays.stream(dp[size - 1]).min().orElse(0);
  }

  private int findMinParent(int[][] dp, int i, int j) {
    boolean hasLeft = (i != 0 && j > 0);
    boolean hasRight = (i != 0 && j < i);
    if (!hasLeft && !hasRight) {
      return 0;
    }
    if (!hasLeft) {
      return dp[i - 1][j];
    }
    if (!hasRight) {
      return dp[i - 1][j - 1];
    }
    return Math.min(dp[i - 1][j], dp[i - 1][j - 1]);
  }

  private int[][] setup(int size) {
    int[][] dp = new int[size][];
    for (int i = 0; i < size; i++) {
      dp[i] = new int[i + 1];
      for (int j = 0; j < i + 1; j++) {
        dp[i][j] = 0;
      }
    }
    return dp;
  }
}
