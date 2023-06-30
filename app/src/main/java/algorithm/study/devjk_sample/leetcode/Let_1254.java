package algorithm.study.devjk_sample.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 리트코드 - Number of Closed Islands
 *
 * @link https://leetcode.com/problems/number-of-closed-islands
 */
public class Let_1254 {

  public static void main(String[] args) {
    Let_1254 sol = new Let_1254();
    System.out.println(
        sol.closedIsland(
            new int[][] {
              {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 1, 0, 0, 1, 0, 1, 1, 1},
              {1, 0, 1, 0, 0, 0, 1, 0, 1, 0},
              {1, 1, 1, 1, 1, 0, 0, 1, 0, 0},
              {1, 0, 1, 0, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
              {1, 0, 1, 0, 0, 0, 0, 1, 1, 0},
              {1, 1, 0, 0, 1, 1, 0, 0, 0, 0},
              {0, 0, 0, 1, 1, 0, 1, 1, 1, 0},
              {1, 1, 0, 1, 0, 1, 0, 0, 1, 0}
            }));
  }

  public int closedIsland(int[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int ans = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0 && !visited[i][j]) {
          if (checkIsland(i, j, grid, visited)) {
            ans++;
          }
        }
      }
    }
    return ans;
  }

  private boolean checkIsland(int i, int j, int[][] grid, boolean[][] visited) {
    int[] dirI = new int[] {0, 1, 0, -1};
    int[] dirJ = new int[] {1, 0, -1, 0};

    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] {i, j});
    visited[i][j] = true;
    boolean isIsland = true;
    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int ci = cur[0];
      int cj = cur[1];
      for (int dir = 0; dir < 4; dir++) {
        int ni = ci + dirI[dir];
        int nj = cj + dirJ[dir];
        if (isOutlined(ni, nj, visited)) {
          isIsland = false;
          continue;
        }
        if (grid[ni][nj] == 0 && !visited[ni][nj]) {
          q.add(new int[] {ni, nj});
          visited[ni][nj] = true;
        }
      }
    }
    return isIsland;
  }

  private boolean isOutlined(int i, int j, boolean[][] visited) {
    return !(i >= 0 && i < visited.length && j >= 0 && j < visited[i].length);
  }
}
