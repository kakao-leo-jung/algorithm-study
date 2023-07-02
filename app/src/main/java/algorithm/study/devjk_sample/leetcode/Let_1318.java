package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Minimum Flips to Make a OR b Equal to c
 *
 * @link https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c
 */
public class Let_1318 {

  public static void main(String[] args) {
    Let_1318 sol = new Let_1318();
    System.out.println(sol.minFlips(2, 6, 5));
    System.out.println(sol.minFlips(4, 2, 7));
    System.out.println(sol.minFlips(1, 2, 3));
  }

  public int minFlips(int a, int b, int c) {
    int ans = 0;
    while (true) {
      if (a == 0 && b == 0 && c == 0) {
        break;
      }
      int a1 = a % 2;
      int b1 = b % 2;
      int c1 = c % 2;
      if (a1 + b1 == 2 && c1 == 0) {
        ans += 2;
      } else if (a1 + b1 == 2 && c1 == 1) {
        ans += 0;
      } else if (a1 + b1 == 0 && c1 == 0) {
        ans += 0;
      } else if (a1 + b1 == 0 && c1 == 1) {
        ans += 1;
      } else if (a1 + b1 == 1 && c1 == 0) {
        ans += 1;
      } else if (a1 + b1 == 1 && c1 == 1) {
        ans += 0;
      }

      a = a / 2;
      b = b / 2;
      c = c / 2;
    }
    return ans;
  }
}
