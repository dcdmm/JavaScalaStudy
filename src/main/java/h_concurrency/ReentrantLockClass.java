package h_concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock类解决共享资源冲突(与使用synchronized关键字相比,代码缺乏优雅性,但是对于解决某些类型的问题来说,更加灵活)
 *
 * It is recommended practice to always immediately follow a call to lock with a try block, most typically in a before/after construction such as:
 *
 *  class X {
 *    private final ReentrantLock lock = new ReentrantLock();
 *    // ...
 *
 *    public void m() {
 *      lock.lock();  // block until condition holds
 *      try {
 *        // ... method body
 *      } finally {
 *        lock.unlock()
 *      }
 *    }
 *  }
 */
public class ReentrantLockClass implements Runnable { // 实现Runnable接口
    private int ticket = 100;
    /*
    When set true, under contention, locks favor granting access to the longest-waiting thread.
    Otherwise this lock does not guarantee any particular access order.
    Programs using fair locks accessed by many threads may display lower overall throughput (i.e., are slower; often much slower) than those using the default setting, but have smaller variances in times to obtain locks and guarantee lack of starvation
     */
    // 也要保证多个线程在同步中使用的是同一个同步锁
    // private static ReentrantLock lock = new ReentrantLock(false); // 若通过继承Thread类创建线程,必须使其为静态属性(内存中只有一个副本)
    private ReentrantLock lock = new ReentrantLock(false); // 非公平锁(默认);若通过继承Thread类创建线程,此时徐
    // private ReentrantLock lock = new ReentrantLock(true); // 公平锁

    @Override
    public void run() {
        while (true) {
            lock.lock(); // Acquires the lock

            // 共享资源的操作部分
            try {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

            finally {
                lock.unlock(); // Attempts to release this lock
            }
        }
    }

    public static void main(String[] args) {
        ReentrantLockClass rlc = new ReentrantLockClass();
        Thread thread0 = new Thread(rlc);
        Thread thread1 = new Thread(rlc);
        Thread thread2 = new Thread(rlc);
        thread0.start();
        thread1.start();
        thread2.start(); // 线程安全
    }
}
