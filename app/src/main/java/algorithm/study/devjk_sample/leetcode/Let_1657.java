package algorithm.study.devjk_sample.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * 리트코드 - Determine if Two Strings Are Close
 *
 * @link https://leetcode.com/problems/determine-if-two-strings-are-close
 */
public class Let_1657 {

  public static void main(String[] args) {
    Let_1657 sol = new Let_1657();
    System.out.println(sol.closeStrings("abc", "bca"));
    System.out.println(sol.closeStrings("a", "aa"));
    System.out.println(sol.closeStrings("cabbba", "abbccc"));
  }

  public boolean closeStrings(String word1, String word2) {
    Set<Character> setWord1 = getCharacterSet(word1);
    Set<Character> setWord2 = getCharacterSet(word2);

    if (setWord1.size() != setWord2.size()) {
      return false;
    }

    for (Character character : setWord1) {
      if (!setWord2.contains(character)) {
        return false;
      }
    }

    Map<Integer, Integer> countWord1 = countWordSet(word1);
    Map<Integer, Integer> countWord2 = countWordSet(word2);

    if (countWord1.size() != countWord2.size()) {
      return false;
    }

    for (Entry<Integer, Integer> countEntry : countWord1.entrySet()) {
      if (!countWord2.containsKey(countEntry.getKey())) {
        return false;
      }
      if (!Objects.equals(countEntry.getValue(), countWord2.get(countEntry.getKey()))) {
        return false;
      }
    }
    return true;
  }

  private Set<Character> getCharacterSet(String word) {
    Set<Character> set = new HashSet<>();
    for (char ch : word.toCharArray()) {
      set.add(ch);
    }
    return set;
  }

  private Map<Integer, Integer> countWordSet(String word) {
    Map<Integer, Integer> map = new HashMap<>();
    Map<Character, Integer> cMap = new HashMap<>();

    for (char ch : word.toCharArray()) {
      if (!cMap.containsKey(ch)) {
        cMap.put(ch, 0);
      }
      cMap.put(ch, cMap.get(ch) + 1);
    }

    for (Integer count : cMap.values()) {
      if (!map.containsKey(count)) {
        map.put(count, 0);
      }
      map.put(count, map.get(count) + 1);
    }
    return map;
  }
}
