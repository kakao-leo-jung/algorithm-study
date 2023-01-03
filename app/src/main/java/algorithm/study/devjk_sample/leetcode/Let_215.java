package algorithm.study.devjk_sample.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 리트코드 - Kth Largest Element in an Array
 *
 * @link https://leetcode.com/problems/kth-largest-element-in-an-array
 */
public class Let_215 {

  public static void main(String[] args) {
    Let_215 sol = new Let_215();
    int ans1 = sol.findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2);
    int ans2 = sol.findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
    int ans3 = sol.findKthLargest(new int[] {3,2,3,1,2,4,5,5,6,7,7,8,2,3,1,1,1,10,11,5,6,2,4,7,8,5,6}, 20);
    System.out.println(ans1); // expected 5
    System.out.println(ans2); // expected 4
    System.out.println(ans3); // expected 2
  }

  public int findKthLargest(int[] nums, int k) {
    return usingQuickSelect(Arrays.stream(nums).boxed().collect(Collectors.toList()), k);
  }

  private int usingQuickSelect(List<Integer> nums, int k) {
    List<Integer> left = new ArrayList<>();
    List<Integer> right = new ArrayList<>();

    int pivot = nums.get(0);
    for (int i = 1; i < nums.size(); i++) {
      int num = nums.get(i);
      if (pivot > num) {
        left.add(num);
      } else {
        right.add(num);
      }
    }
    if (!right.isEmpty() && right.size() >= k) {
      return usingQuickSelect(right, k);
    } else if (right.size() + 1 == k) {
      return pivot;
    } else if(!left.isEmpty()) {
      return usingQuickSelect(left, k - (right.size() + 1));
    }
    return pivot;
  }

}
