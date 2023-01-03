package algorithm.study.devjk_sample.programmers;

import java.util.Arrays;

/**
 * 프로그래머스 - 연속된 수의 합
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */
public class Prg_120923 {

  public static void main(String[] args) {
    Prg_120923 sol = new Prg_120923();
    int[] ans1 = sol.solution(3, 12);
    int[] ans2 = sol.solution(5, 15);
    int[] ans3 = sol.solution(4, 14);
    int[] ans4 = sol.solution(5, 5);

    System.out.println(Arrays.toString(ans1));
    System.out.println(Arrays.toString(ans2));
    System.out.println(Arrays.toString(ans3));
    System.out.println(Arrays.toString(ans4));
  }

  public int[] solution(int num, int total) {

    boolean ss = total % num == 0;
    int base = total / num;
    int start = 0;

    if (ss) {
      // 나눠짐
      start = base - num / 2;
    } else {
      // 안나눠짐
      start = base - (num / 2 - 1);
    }

    return makeAnswer(num, start);
  }

  private int[] makeAnswer(int num, int start) {
    int[] answer = new int[num];
    for (int i = 0; i < num; i++) {
      answer[i] = start + i;
    }
    return answer;
  }


}
