package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 백준 - 숨바꼭질
 *
 * @link https://www.acmicpc.net/problem/1697
 */
public class Boj_1697 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static final int[] map = new int[100001];

  public static void main(String[] args) throws IOException {
    new Boj_1697().solve();
  }

  public void solve() throws IOException {
    // initialize
    Arrays.fill(map, -1);

    String[] token = br.readLine().split(" ");
    int n = Integer.parseInt(token[0]);
    int k = Integer.parseInt(token[1]);
    bw.write(findMinimumWithBfs(n, k) + "\n");
    bw.flush();
  }

  private int findMinimumWithBfs(int n, int k) {
    Queue<Integer> q = new LinkedList<>();
    q.add(n);
    map[n] = 0;

    while (!q.isEmpty()) {
      int cur = q.poll();
      if (cur == k) {
        return map[cur];
      }

      // walk front
      int walkFront = cur + 1;
      if (isAvailable(walkFront) && map[walkFront] == -1) {
        q.add(walkFront);
        map[walkFront] = map[cur] + 1;
      }

      // walk back
      int walkBack = cur - 1;
      if (isAvailable(walkBack) && map[walkBack] == -1) {
        q.add(walkBack);
        map[walkBack] = map[cur] + 1;
      }

      // teleport
      int teleport = cur * 2;
      if (isAvailable(teleport) && map[teleport] == -1) {
        q.add(teleport);
        map[teleport] = map[cur] + 1;
      }
    }

    // not available
    return -1;
  }

  private boolean isAvailable(int n) {
    return n >= 0 && n <= 100000;
  }
}
