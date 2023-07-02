package algorithm.study.devjk_sample.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * 리트코드 - Asteroid Collision
 *
 * @link https://leetcode.com/problems/asteroid-collision
 */
public class Let_735 {

  public static void main(String[] args) {
    Let_735 sol = new Let_735();
    System.out.println(Arrays.toString(sol.asteroidCollision(new int[] {5, 10, -5})));
    System.out.println(Arrays.toString(sol.asteroidCollision(new int[] {8, -8})));
    System.out.println(Arrays.toString(sol.asteroidCollision(new int[] {10, 2 - 5})));
  }

  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> st = new Stack<>();
    for (int asteroid : asteroids) {
      if (st.isEmpty()) {
        st.push(asteroid);
        continue;
      }
      processStack(st, asteroid);
    }

    int[] ans = new int[st.size()];
    for (int i = ans.length - 1; i >= 0; i--) {
      ans[i] = st.pop();
    }
    return ans;
  }

  private void processStack(Stack<Integer> st, int num) {
    if (st.isEmpty()) {
      st.push(num);
      return;
    }
    int cur = st.peek();
    if (cur > 0 && num < 0) {
      // collision
      if (Math.abs(cur) == Math.abs(num)) {
        st.pop();
        return;
      } else if (Math.abs(cur) < Math.abs(num)) {
        st.pop();
        processStack(st, num);
      }
      return;
    }
    st.push(num);
  }
}
