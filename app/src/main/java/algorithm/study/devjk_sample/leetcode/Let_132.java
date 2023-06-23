package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Palindrome Partitioning 2
 *
 * @link https://leetcode.com/problems/palindrome-partitioning-ii
 */
public class Let_132 {

  Integer[][] memo = new Integer[2001][2001];
  Boolean[][] palindromeMap = new Boolean[2001][2001];

  public static void main(String[] args) {
    Let_132 sol = new Let_132();
    System.out.println(sol.minCut("coder"));
    System.out.println(sol.minCut("seeslaveidemonstrateyetartsnomedievalsees"));
    System.out.println(sol.minCut("ababababababababababababcbabababababababababababa"));
  }

  public int minCut(String s) {
    int ans = partitionWithPalindromeCheck(s, 0, s.length() - 1);
    return ans;
  }

  private int partitionWithPalindromeCheck(String s, int start, int end) {
    if (start == end || isPalindrome(s, start, end)) {
      return 0;
    }
    if (memo[start][end] != null) {
      return memo[start][end];
    }

    int min = 987654321;
    for (int i = start; i < end; i++) {
      if (isPalindrome(s, start, i)) {
        int candidate = partitionWithPalindromeCheck(s, i + 1, end) + 1;
        min = Math.min(min, candidate);
      }
    }

    System.out.println("(" + start + "," + end + ") : " + min);
    memo[start][end] = min;
    return min;
  }

  private boolean isPalindrome(String str, int start, int end) {
    if (palindromeMap[start][end] != null) {
      return palindromeMap[start][end];
    }

    if (start >= end) {
      return true;
    }

    boolean isPalindrome =
        (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    return palindromeMap[start][end] = isPalindrome;
  }
}
