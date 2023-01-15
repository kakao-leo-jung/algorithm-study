package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Increasing Triplet Subsequence
 *
 * @link https://leetcode.com/problems/increasing-triplet-subsequence
 */
public class Let_334 {

  public static void main(String[] args) {
    Let_334 sol = new Let_334();
    boolean ans1 = sol.increasingTriplet(new int[] {1, 2, 3, 4, 5});
    boolean ans2 = sol.increasingTriplet(new int[] {5, 4, 3, 2, 1});
    boolean ans3 = sol.increasingTriplet(new int[] {2, 1, 5, 0, 4, 6});
    System.out.println(ans1); // expected true
    System.out.println(ans2); // expected false
    System.out.println(ans3); // expected true
  }

  public boolean increasingTriplet(int[] nums) {
    int first = Integer.MAX_VALUE;
    int second = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num <= first) {
        first = num;
      } else if (num <= second) {
        second = num;
      } else {
        return true;
      }
    }
    return false;
  }
}
