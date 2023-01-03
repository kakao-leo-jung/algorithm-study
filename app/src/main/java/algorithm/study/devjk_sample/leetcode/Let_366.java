package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 리트코드 - Find Leaves of Binary Tree
 *
 * @link https://leetcode.com/problems/find-leaves-of-binary-tree
 */
public class Let_366 {

  public static void main(String[] args) {
    Let_366 sol = new Let_366();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    List<List<Integer>> ans = sol.findLeaves(root);
    System.out.println(ans); // expected [[4,5,3],[2],[1]]
  }

  public List<List<Integer>> findLeaves(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();

    while (!(root.left == null && root.right == null)) {
      List<Integer> list = new ArrayList<>();
      bfs(root, list);
      ans.add(list);
    }
    ans.add(List.of(root.val));
    return ans;
  }

  private void bfs(TreeNode root, List<Integer> list) {
    Queue<TreeHolder> queue = new LinkedList<>();

    queue.add(new TreeHolder(null, root, true));
    while (!queue.isEmpty()) {
      TreeHolder holder = queue.poll();
      if (holder.isLeaf()) {
        list.add(holder.currentVal());
        holder.removeFromParent();
        continue;
      }
      // holder is not leaf
      if (holder.hasLeft()) {
        queue.add(holder.left());
      }
      if (holder.hasRight()) {
        queue.add(holder.right());
      }
    }
  }

  private static class TreeHolder {
    TreeNode parent;
    TreeNode current;
    boolean isLeft;

    public TreeHolder(TreeNode parent, TreeNode current, boolean isLeft) {
      this.parent = parent;
      this.current = current;
      this.isLeft = isLeft;
    }

    public void removeFromParent() {
      if (parent == null) {
        return;
      }
      if (isLeft) {
        parent.left = null;
        return;
      }
      parent.right = null;
    }

    public boolean isLeaf() {
      return (current.left == null && current.right == null);
    }

    public int currentVal() {
      return current.val;
    }

    public boolean hasLeft() {
      return current.left != null;
    }

    public TreeHolder left() {
      return new TreeHolder(current, current.left, true);
    }

    public boolean hasRight() {
      return current.right != null;
    }

    public TreeHolder right() {
      return new TreeHolder(current, current.right, false);
    }
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
