package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Decode String
 *
 * @link https://leetcode.com/problems/decode-string/
 */
public class Let_394 {

  public static void main(String[] args) {
    Let_394 sol = new Let_394();
    String ans1 = sol.decodeString("3[a]2[bc]");
    String ans2 = sol.decodeString("3[a2[c]]");
    String ans3 = sol.decodeString("2[abc]3[cd]ef");
    System.out.println(ans1); // expected aaabcbc
    System.out.println(ans2); // expected accaccacc
    System.out.println(ans3); // expected abcabccdcdcdef
  }

  public String decodeString(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isDigit(ch)) {
        StringBuilder repeatStr = new StringBuilder(String.valueOf(ch));
        while (Character.isDigit(s.charAt(++i))) {
          repeatStr.append(s.charAt(i));
        }
        int repeatCount = Integer.parseInt(repeatStr.toString());
        // i = [
        StringBuilder str = new StringBuilder();
        int stackCount = 0;
        while (!(s.charAt(++i) == ']' && stackCount == 0)) {
          if (s.charAt(i) == '[') {
            stackCount++;
          }
          if (s.charAt(i) == ']') {
            stackCount--;
          }
          str.append(s.charAt(i));
        }
        // i = ]
        String decoded = decodeString(str.toString());
        sb.append(decoded.repeat(repeatCount));
        continue;
      }
      // is not digit
      sb.append(ch);
    }
    return sb.toString();
  }
}
