package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 리트코드 - Delete Nodes And Return Forest
 *
 * @link https://leetcode.com/problems/delete-nodes-and-return-forest
 */
public class Let_1110 {

  public static void main(String[] args) {
    Let_1110 sol = new Let_1110();
  }

  public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    List<TreeNode> ans = new ArrayList<>();
    dfs(root, ans, true, to_delete);
    return ans;
  }

  private boolean dfs(TreeNode root, List<TreeNode> ans, boolean isFirst, int[] to_delete) {
    if (root == null) {
      return false;
    }

    if (hasDelete(to_delete, root.val)) {
      // no save
      if (dfs(root.left, ans, true, to_delete)) {
        root.left = null;
      }
      if (dfs(root.right, ans, true, to_delete)) {
        root.right = null;
      }
      return true;
    }

    if (isFirst) {
      ans.add(root);
    }

    if (dfs(root.left, ans, false, to_delete)) {
      root.left = null;
    }
    if (dfs(root.right, ans, false, to_delete)) {
      root.right = null;
    }
    return false;
  }

  private boolean hasDelete(int[] to_delete, int target) {
    for (int num : to_delete) {
      if (num == target) {
        return true;
      }
    }
    return false;
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
