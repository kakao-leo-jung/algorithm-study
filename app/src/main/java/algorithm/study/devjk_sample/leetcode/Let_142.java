package algorithm.study.devjk_sample.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 리트코드 - Linked List Cycle II
 *
 * @link https://leetcode.com/problems/linked-list-cycle-ii
 */
public class Let_142 {

  public static void main(String[] args) {
    Let_142 sol = new Let_142();
    ListNode node = makeTestCase();
    ListNode ans = sol.detectCycle(node);
    System.out.println(ans.val);
  }

  private static ListNode makeTestCase() {
    int[] arr = new int[] {3, 2, 0, -4};
    ListNode head = new ListNode(arr[0]);
    ListNode pointer = head;
    for (int i = 1; i < arr.length; i++) {
      pointer.next = new ListNode(arr[i]);
      pointer = pointer.next;
    }
    pointer.next = head.next;
    return head;
  }

  public ListNode detectCycle(ListNode head) {
    Set<ListNode> map = new HashSet<>();
    while (head != null && !map.contains(head)) {
      map.add(head);
      head = head.next;
    }
    return head;
  }

  private static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }
}
