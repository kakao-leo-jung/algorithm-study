package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 백준 - 네트워크 연결
 *
 * @link https://www.acmicpc.net/problem/1922
 */
public class Boj_1922 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    new Boj_1922().solve();
  }

  public void solve() throws IOException {
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    List<Edge> edges = setup(m);
    edges.sort(Comparator.comparingInt(o -> o.value));
    int[] conn = setupConnectionInfo(n);

    int totalCost = 0;
    for (Edge edge : edges) {
      if (isAlreadyConnected(edge, conn)) {
        continue;
      }
      totalCost += edge.value;
      connect(edge, conn);
    }

    bw.write(totalCost + "\n");
    bw.flush();
  }

  private void connect(Edge edge, int[] conn) {
    int a = find(edge.a, conn);
    int b = find(edge.b, conn);
    if (a > b) {
      conn[b] = a;
    } else {
      conn[a] = b;
    }
  }

  private boolean isAlreadyConnected(Edge edge, int[] conn) {
    return find(edge.a, conn) == find(edge.b, conn);
  }

  private int find(int x, int[] conn) {
    if (conn[x] == x) {
      return x;
    } else {
      return conn[x] = find(conn[x], conn);
    }
  }

  private List<Edge> setup(int size) throws IOException {
    List<Edge> edges = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      String[] token = br.readLine().split(" ");
      int a = Integer.parseInt(token[0]);
      int b = Integer.parseInt(token[1]);
      int c = Integer.parseInt(token[2]);
      edges.add(new Edge(a, b, c));
    }
    return edges;
  }

  private int[] setupConnectionInfo(int n) {
    int[] conn = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      conn[i] = i;
    }
    return conn;
  }

  private static class Edge {
    int a;
    int b;
    int value;

    public Edge(int a, int b, int value) {
      this.a = a;
      this.b = b;
      this.value = value;
    }
  }
}
