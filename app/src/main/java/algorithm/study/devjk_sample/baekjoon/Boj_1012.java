package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 백준 - 유기농 배추
 *
 * @link https://www.acmicpc.net/problem/1012
 */
public class Boj_1012 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static final int[] dirI = {0, 1, 0, -1};
  public static final int[] dirJ = {1, 0, -1, 0};

  public static void main(String[] args) throws IOException {
    new Boj_1012().solve();
  }

  public void solve() throws IOException {

    int size = Integer.parseInt(br.readLine());
    while (size-- > 0) {
      int answer = 0;
      int[][] map = setupMap(br);

      for (int i = 0; i < map.length; i++) {
        for (int j = 0; j < map[i].length; j++) {
          if (map[i][j] == 1) {
            answer++;
            checkAdjacentWithBfs(map, i, j);
          }
        }
      }

      bw.write(answer + "\n");
    }
    bw.flush();
  }

  private void checkAdjacentWithBfs(int[][] map, int i, int j) {
    Queue<int[]> q = new LinkedList<>();
    q.add(new int[] {i, j});
    map[i][j] = -1; // check

    while (!q.isEmpty()) {
      int[] cur = q.poll();
      int ci = cur[0];
      int cj = cur[1];
      for (int dir = 0; dir < 4; dir++) {
        int ni = ci + dirI[dir];
        int nj = cj + dirJ[dir];
        if (isAvailable(ni, nj, map) && map[ni][nj] == 1) {
          q.add(new int[] {ni, nj});
          map[ni][nj] = -1;
        }
      }
    }
  }

  private boolean isAvailable(int i, int j, int[][] map) {
    return i >= 0 && i < map.length && j >= 0 && j < map[0].length;
  }

  private int[][] setupMap(BufferedReader br) throws IOException {
    String[] token = br.readLine().split(" ");
    int m = Integer.parseInt(token[0]);
    int n = Integer.parseInt(token[1]);
    int k = Integer.parseInt(token[2]);

    int[][] map = new int[n][m];
    for (int i = 0; i < k; i++) {
      token = br.readLine().split(" ");
      int x = Integer.parseInt(token[0]);
      int y = Integer.parseInt(token[1]);
      map[y][x] = 1;
    }
    return map;
  }
}
