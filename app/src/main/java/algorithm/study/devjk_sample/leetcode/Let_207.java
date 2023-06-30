package algorithm.study.devjk_sample.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 리트코드 - Course Schedule
 *
 * @link https://leetcode.com/problems/course-schedule
 */
public class Let_207 {

  public static void main(String[] args) {
    Let_207 sol = new Let_207();
    System.out.println(sol.canFinish(2, new int[][] {{1, 0}}));
    System.out.println(sol.canFinish(2, new int[][] {{1, 0}, {0, 1}}));
  }

  public boolean canFinish(int numCourses, int[][] prerequisites) {

    int[] degree = new int[numCourses];

    // 1. set in-degrees
    for (int[] prerequisite : prerequisites) {
      int num = prerequisite[0];
      degree[num]++;
    }

    // 2. find in-degree 0 (initial point)
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < degree.length; i++) {
      if (degree[i] == 0) {
        // add
        queue.add(i);
      }
    }

    while (!queue.isEmpty()) {
      int current = queue.poll();
      // remove connected in-degree
      for (int[] prerequisite : prerequisites) {
        int num = prerequisite[0];
        int required = prerequisite[1];
        if (required == current) {
          if (--degree[num] == 0) {
            queue.add(num);
          }
        }
      }
    }

    // all numbers should have 0 in-degree when no cycling occurred
    for (int i = 0; i < degree.length; i++) {
      if (degree[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
