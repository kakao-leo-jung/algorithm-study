package algorithm.study.devjk_sample.programmers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 - 억억단을 외우자
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/138475
 */
public class Prg_138475 {

  public static void main(String[] args) {
    Prg_138475 sol = new Prg_138475();
    System.out.println(Arrays.toString(sol.solution(8, new int[] {1, 3, 7}))); // expected [6,6,8]
  }

  public int[] solution(int e, int[] starts) {
    List<Holder> holders = setup(e);
    int[] answer = new int[starts.length];
    for (int i = 0; i < starts.length; i++) {
      answer[i] = getMin(starts[i], e, holders);
    }
    return answer;
  }

  private int getMin(int start, int end, List<Holder> holders) {
    return holders.stream()
        .filter(holder -> start <= holder.key && holder.key <= end)
        .findFirst()
        .map(holder -> holder.key)
        .orElse(0);
  }

  private List<Holder> sort(Holder[] holders) {
    return Arrays.stream(holders)
        .sorted((o1, o2) -> o2.value - o1.value)
        .collect(Collectors.toList());
  }

  private List<Holder> setup(int e) {
    Holder[] holders = new Holder[e + 1];
    for (int i = 0; i < holders.length; i++) {
      holders[i] = new Holder(i);
    }
    for (int i = 1; i <= e; i++) {
      for (int j = 1; j <= e / i; j++) {
        int num = i * j;
        holders[num].value++;
      }
    }
    return sort(holders);
  }

  private static class Holder {

    int key;
    int value;

    Holder(int key) {
      this.key = key;
    }
  }
}
