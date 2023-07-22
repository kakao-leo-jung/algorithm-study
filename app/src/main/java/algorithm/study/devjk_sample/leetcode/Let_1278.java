package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 리트코드 - Palindrome Partitioning III
 *
 * @link https://leetcode.com/problems/palindrome-partitioning-iii
 */
public class Let_1278 {

  Integer[][] memo = new Integer[101][101];
  Integer[][] dp = new Integer[101][101];

  public static void main(String[] args) {
    Let_1278 sol = new Let_1278();
//            System.out.println(sol.palindromePartition("abc", 2));
//    System.out.println(sol.palindromePartition("aabbc", 3));
//        System.out.println(sol.palindromePartition("leetcode", 8));
                System.out.println(sol.palindromePartition("faaglagedtwnejzpuarkgwgoefwra", 27));
        System.out.println(sol.palindromePartition("oiwwhqjkb", 1));
  }

  public int palindromePartition(String s, int k) {
    return findCase(s, k - 1, 0, new ArrayList<>());
  }

  private int findCase(String s, int k, int index, List<Integer> cut) {
    if (dp[index][k] != null) {
      return dp[index][k];
    }

    if (index >= s.length() - 1 && k > 0) {
      return dp[index][k] = Integer.MAX_VALUE;
    }

    if (k == 0) {
      return dp[index][k] = getMinimumPalindrome(s, cut);
    }

    int ans = Integer.MAX_VALUE;
    for (int i = index; i < s.length() - 1; i++) {
      int temp;
      cut.add(i);
      temp = findCase(s, k - 1, i + 1, cut);
      cut.remove(cut.size() - 1);
      ans = Math.min(ans, temp);
    }

    return dp[index][k] = ans;
  }

  private int getMinimumPalindrome(String s, List<Integer> cut) {
    if (cut.isEmpty()) {
      return countChangesToPalindrome(s, 0, s.length() - 1);
    }

    int count = 0;
    for (int i = 0; i < cut.size(); i++) {
      int pre = 0;
      if (i != 0) {
        pre = cut.get(i - 1) + 1;
      }
      int cur = cut.get(i);
      count += countChangesToPalindrome(s, pre, cur);
    }
    count += countChangesToPalindrome(s, cut.get(cut.size() - 1) + 1, s.length() - 1);
    return count;
  }

  private int countChangesToPalindrome(String s, int pre, int cur) {
    if (memo[pre][cur] != null) {
      return memo[pre][cur];
    }

    int count = 0;
    int size = (cur - pre) / 2;
    for (int i = pre; i <= pre + size; i++) {
      int ri = cur - i + pre;
      if (s.charAt(i) != s.charAt(ri)) {
        count++;
      }
    }
    return memo[pre][cur] = count;
  }
}
