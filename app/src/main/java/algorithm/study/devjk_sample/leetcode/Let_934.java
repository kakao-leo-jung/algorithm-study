package algorithm.study.devjk_sample.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 리트코드 - Shortest Bridge
 *
 * @link https://leetcode.com/problems/shortest-bridge
 */
public class Let_934 {

  public static void main(String[] args) {
    Let_934 sol = new Let_934();
    //    System.out.println(
    //        sol.shortestBridge(
    //            new int[][] {
    //              {1, 1, 1, 1, 1},
    //              {1, 0, 0, 0, 1},
    //              {1, 0, 1, 0, 1},
    //              {1, 0, 0, 0, 1},
    //              {1, 1, 1, 1, 1},
    //            }));
    //
    //    System.out.println(
    //        sol.shortestBridge(
    //            new int[][] {
    //              {0, 1},
    //              {1, 0},
    //            }));
    //
    //    System.out.println(
    //        sol.shortestBridge(
    //            new int[][] {
    //              {0, 1, 0},
    //              {0, 0, 0},
    //              {0, 0, 1},
    //            }));

    System.out.println(
        sol.shortestBridge(
            new int[][] {
              {0, 0, 0, 1, 1},
              {0, 0, 0, 1, 0},
              {0, 0, 0, 1, 1},
              {0, 0, 1, 0, 1},
              {0, 0, 1, 1, 0}
            }));
  }

  public int shortestBridge(int[][] grid) {
    // mark 1
    boolean[][] mark = new boolean[grid.length][grid.length];
    markIsland1(grid, mark);

    int min = 987654321;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0 && isAdjacentMark1(i, j, mark)) {
          int path = getBridgeWithBfs(i, j, grid, mark);
          min = Math.min(min, path);
        }
      }
    }
    return min;
  }

  private boolean isAdjacentMark1(int i, int j, boolean[][] markIsland1) {
    int[] dirI = new int[] {0, 1, 0, -1};
    int[] dirJ = new int[] {1, 0, -1, 0};
    for (int dir = 0; dir < 4; dir++) {
      int ni = i + dirI[dir];
      int nj = j + dirJ[dir];
      if (isAvailableGrid(ni, nj, markIsland1.length) && markIsland1[ni][nj]) {
        return true;
      }
    }
    return false;
  }

  private void markIsland1(int[][] grid, boolean[][] mark) {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        // mark island1 only
        if (grid[i][j] == 1 && !mark[i][j]) {
          markWithDfs(i, j, grid, mark);
          return;
        }
      }
    }
  }

  private void markWithDfs(int i, int j, int[][] grid, boolean[][] visited) {
    int[] dirI = new int[] {0, 1, 0, -1};
    int[] dirJ = new int[] {1, 0, -1, 0};
    visited[i][j] = true;
    for (int dir = 0; dir < 4; dir++) {
      int ni = i + dirI[dir];
      int nj = j + dirJ[dir];
      if (isAvailableGrid(ni, nj, grid.length) && !visited[ni][nj] && grid[ni][nj] == 1) {
        markWithDfs(ni, nj, grid, visited);
      }
    }
  }

  private int getBridgeWithBfs(int i, int j, int[][] grid, boolean[][] island1Marked) {
    int[] dirI = new int[] {0, 1, 0, -1};
    int[] dirJ = new int[] {1, 0, -1, 0};
    int[][] visited = new int[grid.length][grid.length];
    Queue<int[]> q = new LinkedList<>();
    visited[i][j] = 1;
    q.add(new int[] {i, j});
    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int ci = cur[0];
      int cj = cur[1];
      if (grid[ci][cj] == 1) {
        return visited[ci][cj] - 1;
      }
      for (int dir = 0; dir < 4; dir++) {
        int ni = ci + dirI[dir];
        int nj = cj + dirJ[dir];
        if (isAvailableGrid(ni, nj, grid.length)
            && visited[ni][nj] == 0
            && !island1Marked[ni][nj]) {
          visited[ni][nj] = visited[ci][cj] + 1;
          q.add(new int[] {ni, nj});
        }
      }
    }

    // unable to reach
    return 987654321;
  }

  private boolean isAvailableGrid(int i, int j, int n) {
    return i >= 0 && i < n && j >= 0 && j < n;
  }
}
