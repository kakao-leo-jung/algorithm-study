package algorithm.study.devjk_sample.leetcode;

import java.util.concurrent.Semaphore;

/**
 * 리트코드 - Print FooBar Alternately
 *
 * @link https://leetcode.com/problems/print-foobar-alternately
 */
public class Let_1115 {

  public static void main(String[] args) throws InterruptedException {
    FooBar fooBar = new FooBar(1000);
    Runnable bar =
        () -> {
          try {
            fooBar.bar(() -> System.out.println("bar"));
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };
    Runnable foo =
        () -> {
          try {
            fooBar.foo(() -> System.out.println("foo"));
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        };

    new Thread(bar).start();
    new Thread(foo).start();
  }

  private static class FooBar {

    private int n;
    private final Semaphore fooLock = new Semaphore(1);
    private final Semaphore barLock = new Semaphore(0);

    public FooBar(int n) {
      this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
      for (int i = 0; i < n; i++) {
        fooLock.acquire();
        // printFoo.run() outputs "foo". Do not change or remove this line.
        printFoo.run();
        barLock.release();
      }
    }

    public void bar(Runnable printBar) throws InterruptedException {
      for (int i = 0; i < n; i++) {
        barLock.acquire();
        // printBar.run() outputs "bar". Do not change or remove this line.
        printBar.run();
        fooLock.release();
      }
    }
  }
}
