package h_concurrency;

/**
 * 线程优先级
 * 调度器倾向于让优先级最高的线程先执行,这并不意味着优先级较低的线程将得不到执行(也就是说,优先权不会导致死锁).优先级较低的线程仅仅是执行的频率较低
 * The minimum priority that a thread can have:MIN_PRIORITY = 1
 * The default priority that is assigned to a thread:NORM_PRIORITY = 5
 * The maximum priority that a thread can have:MAX_PRIORITY = 10
 */
public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("ThreadPriority:" + Thread.currentThread().getPriority() + ":   " + i); // Returns this thread's priority.
        }
    }

    public static void main(String[] args) {
        ThreadPriority tp = new ThreadPriority();
        tp.setPriority(8);  // Changes the priority of this thread.
        tp.start();
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);  // 更改主线程线程优先级
        for (int i = 0; i < 50; i++) {
            System.out.println("main:" + Thread.currentThread().getPriority() + ":   " + i);
        }
        // 执行结果交替出现
    }
}
