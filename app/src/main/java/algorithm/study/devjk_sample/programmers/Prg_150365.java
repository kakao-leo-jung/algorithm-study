package algorithm.study.devjk_sample.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 프로그래머스 - 미로 탈출 명령어
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/150365
 */
public class Prg_150365 {

  private String answer = "";
  // d -> l -> r -> u
  private int[] dirI = new int[] {1, 0, 0, -1};
  private int[] dirJ = new int[] {0, -1, 1, 0};
  private char[] ch = new char[] {'d', 'l', 'r', 'u'};

  public static void main(String[] args) {
    Prg_150365 sol = new Prg_150365();
    System.out.println(sol.solution(3, 4, 2, 3, 3, 1, 5));
    System.out.println(sol.solution(2, 2, 1, 1, 2, 2, 2));
    System.out.println(sol.solution(3, 3, 1, 2, 3, 3, 4));
  }

  public String solution(int n, int m, int x, int y, int r, int c, int k) {
    if (dfs(n, m, x - 1, y - 1, r - 1, c - 1, k, 0, new ArrayList<>())) {
      return answer;
    }
    return "impossible";
  }

  private boolean dfs(
      int n, int m, int i, int j, int r, int c, int k, int move, List<Character> list) {
    if (move == k) {
      if (i == r && j == c) {
        answer = list.stream().map(String::valueOf).collect(Collectors.joining());
        return true;
      }
      return false;
    }

    int remain = Math.abs(i - r) + Math.abs(j - c);
    if (remain > k - move || (k - move - remain) % 2 != 0) {
      return false;
    }

    for (int dir = 0; dir < 4; dir++) {
      int ni = i + dirI[dir];
      int nj = j + dirJ[dir];
      if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
        list.add(ch[dir]);
        if (dfs(n, m, ni, nj, r, c, k, move + 1, list)) {
          return true;
        }
        list.remove(list.size() - 1);
      }
    }
    return false;
  }
}
