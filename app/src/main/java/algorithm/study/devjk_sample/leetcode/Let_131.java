package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 리트코드 - Palindrome Partitioning
 *
 * @link https://leetcode.com/problems/palindrome-partitioning
 */
public class Let_131 {

  public static void main(String[] args) {
    Let_131 sol = new Let_131();
    System.out.println(sol.partition("abcdefg"));
  }

  public List<List<String>> partition(String s) {
    List<List<String>> arr = new ArrayList<>();
    partitionWithDfs(s, new boolean[s.length() - 1], 0, arr);
    return arr;
  }

  private void partitionWithDfs(String s, boolean[] indexList, int cursor, List<List<String>> ans) {
    if (cursor >= indexList.length) {
      // todo check palindrome
      checkPalindrome(s, indexList, ans);
      return;
    }
    indexList[cursor] = false;
    partitionWithDfs(s, indexList, cursor + 1, ans);
    indexList[cursor] = true;
    partitionWithDfs(s, indexList, cursor + 1, ans);
  }

  private void checkPalindrome(String s, boolean[] indexList, List<List<String>> ans) {
    // make set
    List<String> strs = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    sb.append(s.charAt(0));
    for (int i = 0; i < indexList.length; i++) {
      if (indexList[i]) {
        strs.add(sb.toString());
        sb = new StringBuilder();
        sb.append(s.charAt(i + 1));
        continue;
      }
      sb.append(s.charAt(i + 1));
    }
    strs.add(sb.toString());

    if (isAllPalindrome(strs)) {
      ans.add(strs);
    }
  }

  private boolean isAllPalindrome(List<String> strs) {
    for (String str : strs) {
      if (!isPalindrome(str)) {
        return false;
      }
    }
    return true;
  }

  private boolean isPalindrome(String s) {
    int sLength = s.length() - 1;
    int size = (s.length() - 1) / 2;
    for (int i = 0; i <= size; i++) {
      int ri = sLength - i;
      if (s.charAt(i) != s.charAt(ri)) {
        return false;
      }
    }
    return true;
  }
}
