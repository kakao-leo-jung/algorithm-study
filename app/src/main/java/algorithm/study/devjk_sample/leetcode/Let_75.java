package algorithm.study.devjk_sample.leetcode;

import java.util.Arrays;

/**
 * 리트코드 - Sort Colors
 *
 * @link https://leetcode.com/problems/sort-colors
 */
public class Let_75 {

  public static void main(String[] args) {
    Let_75 sol = new Let_75();
    int[] arr = new int[] {2, 0, 2, 1, 1, 0};
    sol.sortColors(arr);
    System.out.println(Arrays.toString(arr)); // expected [0, 0, 1, 1, 2, 2]
  }

  public void sortColors(int[] nums) {
    divide(nums, 0, nums.length - 1);
  }

  private void divide(int[] nums, int start, int end) {
    if (start == end) {
      return;
    }
    int sum = start + end;
    int mid = sum / 2;
    divide(nums, start, mid);
    divide(nums, mid + 1, end);
    conquer(nums, start, mid, end);
  }

  private void conquer(int[] nums, int start, int mid, int end) {
    int left = start;
    int right = mid + 1;
    int offset = 0;
    int[] temp = new int[end - start + 1];
    while (left <= mid && right <= end) {
      if (nums[left] < nums[right]) {
        temp[offset++] = nums[left++];
        continue;
      }
      temp[offset++] = nums[right++];
    }
    while (left <= mid) {
      temp[offset++] = nums[left++];
    }
    while (right <= end) {
      temp[offset++] = nums[right++];
    }
    offset = 0;
    for (int i = start; i <= end; i++) {
      nums[i] = temp[offset++];
    }
  }
}
