package algorithm.study.devjk_sample.leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

/**
 * 리트코드 - Maximum Level Sum of a Binary Tree
 *
 * @link https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree
 */
public class Let_1161 {

  public static void main(String[] args) {
    Let_1161 sol = new Let_1161();
  }

  public int maxLevelSum(TreeNode root) {
    int ans = 1;
    // bfs
    Queue<TreeNode> q = new LinkedList<>();
    Queue<Integer> levelq = new LinkedList<>();
    Map<Integer, Integer> map = new LinkedHashMap<>();
    q.add(root);
    levelq.add(1);
    int sum = 0;
    int currentLevel = 1;
    while (!q.isEmpty()) {
      TreeNode cur = q.poll();
      int level = levelq.poll();
      if (level > currentLevel) {
        map.put(currentLevel, sum);
        sum = 0;
        currentLevel = level;
      }
      sum += cur.val;
      if (cur.left != null) {
        q.offer(cur.left);
        levelq.offer(level + 1);
      }
      if (cur.right != null) {
        q.offer(cur.right);
        levelq.offer(level + 1);
      }
    }
    map.put(currentLevel, sum);

    sum = map.get(1);
    for (Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > sum) {
        ans = entry.getKey();
        sum = entry.getValue();
      }
    }

    return ans;
  }

  public class TreeNode {
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
