package h_concurrency;

/**
 * synchronized(关键字)同步方法解决共享资源冲突
 */
public class SynchronizedMethod {
    public static void main(String[] args) {
        MethodModeOne mo0 = new MethodModeOne();
        MethodModeOne mo1 = new MethodModeOne();
        MethodModeOne mo2 = new MethodModeOne();
        mo0.start();
        mo1.start();
        mo2.start(); // 线程安全
    }
}


class SynchronizedMethodTest {
    public static void main(String[] args) {
        MethodModeTwo mm = new MethodModeTwo();
        Thread thread0 = new Thread(mm);
        Thread thread1 = new Thread(mm);
        Thread thread2 = new Thread(mm);
        thread0.start();
        thread1.start();
        thread2.start(); // 线程安全
    }
}


class MethodModeOne extends Thread { // 继承Thread类
    private static int ticket = 100;

    public void run() {
        do {
            show();
        } while (ticket > 0);
    }

    // 必须为静态方法(内存中只有一个副本)
    private static synchronized void show() { // 隐式的同步锁:MethodModeOne.class(满足多个线程在同步中使用的是同一个同步锁)
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + ticket);
            ticket--;
        }
    }
}


class MethodModeTwo implements Runnable { // 实现Runnable接口
    private int ticket = 100;

    @Override
    public void run() {
        do {
            show();
        } while (ticket > 0);
    }

    private synchronized void show() { // 隐式的同步锁:this(满足多个线程在同步中使用的是同一个同步锁)
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ": " + ticket);
            ticket--;
        }
    }
}
