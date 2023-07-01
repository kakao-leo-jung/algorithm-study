package algorithm.study.devjk_sample.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 리트코드 - Maximum Number of Vowels in a Substring of Given Length
 *
 * @link https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
 */
public class Let_1456 {

  public static void main(String[] args) {
    Let_1456 sol = new Let_1456();
    System.out.println(sol.maxVowels("abciiidef", 3));
    System.out.println(sol.maxVowels("aeiou", 2));
    System.out.println(sol.maxVowels("leetcode", 3));
    System.out.println(sol.maxVowels("weallloveyou", 7));
  }

  public int maxVowels(String s, int k) {
    Set<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
    int start = 0;
    int end = 0;
    int max = 0;
    int cur = 0;
    for (; end < s.length(); end++) {
      if (end - start >= k) {
        if (set.contains(s.charAt(start))) {
          cur--;
        }
        start++;
      }
      if (set.contains(s.charAt(end))) {
        cur++;
      }
      max = Math.max(max, cur);
    }
    return max;
  }
}
