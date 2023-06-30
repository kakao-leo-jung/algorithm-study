package algorithm.study.devjk_sample.leetcode;

/**
 * 리트코드 - Peak Index in a Mountain Array
 *
 * @link https://leetcode.com/problems/peak-index-in-a-mountain-array
 */
public class Let_852 {

  public static void main(String[] args) {
    Let_852 sol = new Let_852();
    System.out.println(sol.peakIndexInMountainArray(new int[] {0, 1, 0}));
    System.out.println(sol.peakIndexInMountainArray(new int[] {0, 2, 1, 0}));
    System.out.println(sol.peakIndexInMountainArray(new int[] {0, 10, 5, 2}));
  }

  public int peakIndexInMountainArray(int[] arr) {
    // binary search
    int left = 0;
    int right = arr.length - 1;
    int current;

    while (left <= right) {
      current = (left + right) / 2;
      if (isPeak(arr, current)) {
        return current;
      } else if (isAscending(arr, current)) {
        left = current + 1;
      } else if (isDescending(arr, current)) {
        right = current - 1;
      } else {
        throw new RuntimeException("unavailable");
      }
    }
    throw new RuntimeException("cannot find peak");
  }

  private boolean isPeak(int[] arr, int index) {
    if (index == 0) {
      return arr[index] > arr[index + 1];
    } else if (index == arr.length - 1) {
      return arr[index - 1] < arr[index];
    }
    return arr[index - 1] < arr[index] && arr[index] > arr[index + 1];
  }

  private boolean isAscending(int[] arr, int index) {
    if (index == 0) {
      return arr[index] < arr[index + 1];
    } else if (index == arr.length - 1) {
      return arr[index - 1] < arr[index];
    }
    return arr[index - 1] < arr[index] && arr[index] < arr[index + 1];
  }

  private boolean isDescending(int[] arr, int index) {
    if (index == 0) {
      return arr[index] > arr[index + 1];
    } else if (index == arr.length - 1) {
      return arr[index - 1] > arr[index];
    }
    return arr[index - 1] > arr[index] && arr[index] > arr[index + 1];
  }
}
