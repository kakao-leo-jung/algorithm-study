package algorithm.study.devjk_sample.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 리트코드 - Simplify Path
 *
 * @link https://leetcode.com/problems/simplify-path
 */
public class Let_71 {

  public static void main(String[] args) {
    Let_71 sol = new Let_71();
    String sol1 = sol.simplifyPath("/home/");
    String sol2 = sol.simplifyPath("/../");
    String sol3 = sol.simplifyPath("/home//foo/");
    String sol4 = sol.simplifyPath("/usr//bin/..");
    System.out.println(sol1); // expected /home
    System.out.println(sol2); // expected /
    System.out.println(sol3); // expected /home/foo
    System.out.println(sol4); // expected /usr
  }

  public String simplifyPath(String path) {
    path = path.replaceAll("//", "/");
    List<String> tokens =
        Arrays.stream(path.split("/")).filter(str -> !"".equals(str)).collect(Collectors.toList());

    Stack<String> stack = new Stack<>();
    tokens.forEach(
        token -> {
          if ("..".equals(token)) {
            if (!stack.isEmpty()) {
              stack.pop();
            }
            return;
          }
          if (".".equals(token)) {
            return;
          }
          stack.push(token);
        });

    return "/" + String.join("/", stack);
  }
}
