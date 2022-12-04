package algorithm.study.devjk_sample.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * 백준 - 보물
 *
 * @link https://www.acmicpc.net/problem/1026
 */
public class Boj_1026 {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

  public static void main(String[] args) throws IOException {
    new Boj_1026().solve();
  }

  public void solve() throws IOException {

    int size = Integer.parseInt(br.readLine());
    List<Integer> a = parse(br.readLine(), size);
    List<Integer> b = parse(br.readLine(), size);

    int answer = greedy(a, b, size);

    bw.write(String.valueOf(answer));
    bw.flush();
  }

  private int greedy(List<Integer> a, List<Integer> b, int size) {
    a = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    b = b.stream().sorted().collect(Collectors.toList());
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += a.get(i) * b.get(i);
    }
    return sum;
  }

  private List<Integer> parse(String line, int size) {
    StringTokenizer tokenizer = new StringTokenizer(line, " ");
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      list.add(Integer.valueOf(tokenizer.nextToken()));
    }
    return list;
  }
}
