package algorithm.study.devjk_sample.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 리트코드 - Logger Rate Limiter
 *
 * @link https://leetcode.com/problems/logger-rate-limiter
 */
public class Let_359 {

  public static void main(String[] args) {
    Logger logger = new Logger();
    System.out.println(logger.shouldPrintMessage(1, "foo"));
    System.out.println(logger.shouldPrintMessage(2, "bar"));
    System.out.println(logger.shouldPrintMessage(3, "foo"));
    System.out.println(logger.shouldPrintMessage(8, "bar"));
    System.out.println(logger.shouldPrintMessage(10, "foo"));
    System.out.println(logger.shouldPrintMessage(11, "foo"));
  }

  private static class Logger {

    private final Map<String, Integer> cache;

    public Logger() {
      this.cache = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
      if (!cache.containsKey(message)) {
        cache.put(message, 0);
      }

      if (timestamp >= cache.get(message)) {
        // true, update cache
        cache.put(message, timestamp + 10);
        return true;
      }
      return false;
    }
  }
}
