package algorithm.study.devjk_sample.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 리트코드 - Design Hit Counter
 *
 * @link https://leetcode.com/problems/design-hit-counter
 */
public class Let_362 {

  public static void main(String[] args) {
    HitCounter hitCounter = new HitCounter();
    hitCounter.hit(1);
    hitCounter.hit(2);
    hitCounter.hit(3);
    System.out.println(hitCounter.getHits(4));
    hitCounter.hit(300);
    System.out.println(hitCounter.getHits(300));
    System.out.println(hitCounter.getHits(301));
  }

  private static class HitCounter {

    private final Queue<Integer> queue;
    private int current;

    public HitCounter() {
      this.queue = new LinkedList<>();
      this.current = 0;
    }

    public void hit(int timestamp) {
      queue.offer(timestamp);
      updateQueue(timestamp);
    }

    public int getHits(int timestamp) {
      updateQueue(timestamp);
      return queue.size();
    }

    private void updateQueue(int timestamp) {
      while (!queue.isEmpty()) {
        if (queue.peek() <= timestamp - 300) {
          Integer popped = queue.poll();
        } else {
          break;
        }
      }
    }
  }
}
