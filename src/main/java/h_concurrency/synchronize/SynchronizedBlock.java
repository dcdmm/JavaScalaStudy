package h_concurrency.synchronize;

/**
 * synchronized(关键字)同步代码块解决共享资源冲突
 * 当任务要执行被synchronized关键字保护的代码片段时,它将检查锁是否可用===>
 * 1. 可用则获取锁--->执行代码--->释放锁
 * 2. 不可用则被阻塞
 */
public class SynchronizedBlock {
    public static void main(String[] args) {
        BlockModeOne mo0 = new BlockModeOne();
        BlockModeOne mo1 = new BlockModeOne();
        BlockModeOne mo2 = new BlockModeOne();
        mo0.start();
        mo1.start();
        mo2.start();  // 线程安全
    }
}


class SynchronizedBlockTest {
    public static void main(String[] args) {
        BlockModeTwo sk = new BlockModeTwo();
        Thread thread0 = new Thread(sk);
        Thread thread1 = new Thread(sk);
        Thread thread2 = new Thread(sk);
        thread0.start();
        thread1.start();
        thread2.start();  // 线程安全
    }
}


class BlockModeOne extends Thread {  // 继承Thread类
    private static int ticket = 100;
    private static final Object obj = new Object();  // 静态属性(内存中只有一个副本)

    public void run() {
        while (true) {
            // 必须保证多个线程在同步中使用的是同一个同步锁(也称为同步监视器)
            // synchronized (SynchronizedBlock0.class) { // 方式1(同步锁为类对象)
            synchronized (obj) { // 方式2
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
        }
    }
}


class BlockModeTwo implements Runnable {  // 实现Runnable接口
    private int ticket = 100;
    final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 必须保证多个线程在同步中使用的是同一个同步锁
            // synchronized (this) { // 方式1(同步锁为当前对象)
            //synchronized (SynchronizedBlock1.class) {  // 方式2(同步锁为类对象)
            synchronized (obj) {  // 方式3(同步锁为莫某实例对象)
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
        }
    }
}


