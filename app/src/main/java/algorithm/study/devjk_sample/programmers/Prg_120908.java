package algorithm.study.devjk_sample.programmers;

/**
 * 프로그래머스 - 문자열안에 문자열
 *
 * @link https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
public class Prg_120908 {

  private final int CONTAIN = 1;
  private final int NOT_CONTAIN = 2;

  public static void main(String[] args) {
    Prg_120908 sol = new Prg_120908();
    int ans1 = sol.solution("ab6CDE443fgh22iJKlmn1o", "6CD");
    int ans2 = sol.solution("ppprrrogrammers", "pppp");
    int ans3 = sol.solution("AbcAbcA", "AAA");

    System.out.println(ans1); // expected 1
    System.out.println(ans2); // expected 2
    System.out.println(ans3); // expected 2
  }

  public int solution(String str1, String str2) {
    char[] ch1 = str1.toCharArray();
    for (int i = 0; i < ch1.length; i++) {
      if (!isMatchFirstCharacter(ch1[i], str2)) {
        continue;
      }
      // 첫글자 일치 하면 전체 일치하는지 확인
      if (checkMatch(ch1, i, str2)) {
        return CONTAIN;
      }
    }

    return NOT_CONTAIN;
  }

  private boolean isMatchFirstCharacter(char ch, String str2) {
    return ch == str2.charAt(0);
  }

  private boolean checkMatch(char[] ch1, int i, String str2) {
    int checkSize = i + str2.length();

    int j = 0;
    while (i < ch1.length && i < checkSize) {
      if (ch1[i] != str2.charAt(j)) {
        return false;
      }
      i++;
      j++;
    }
    return i == checkSize;
  }
}
