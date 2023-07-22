package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Path Sum III
 *
 * @link https://leetcode.com/problems/path-sum-iii
 */
public class Let_437 {

  public static void main(String[] args) {
    Let_437 sol = new Let_437();
  }

  public int pathSum(TreeNode root, int targetSum) {
    return dfs(root, targetSum, 0);
  }

  private int dfs(TreeNode root, int targetSum, long sum) {
    if (root == null) {
      return 0;
    }

    int count = 0;
    sum += root.val;

    if (sum == targetSum) {
      count++;
    }

    count += dfs(root.left, targetSum, 0);
    count += sumToEnd(root.left, targetSum, sum);
    count += dfs(root.right, targetSum, 0);
    count += sumToEnd(root.right, targetSum, sum);

    return count;
  }

  private int sumToEnd(TreeNode root, int targetSum, long sum) {
    if (root == null) {
      return 0;
    }

    int count = 0;
    sum += root.val;
    if (sum == targetSum) {
      count++;
    }

    count += sumToEnd(root.left, targetSum, sum);
    count += sumToEnd(root.right, targetSum, sum);

    return count;
  }

  private static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }
}
