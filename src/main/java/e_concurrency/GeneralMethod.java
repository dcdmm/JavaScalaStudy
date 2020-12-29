package e_concurrency;

import org.junit.Test;

/**
 * Thread类常见方法
 * *. public void run()
 * *. public void start()
 * *. public static Thread currentThread()
 * *. public final String getName()
 * *. public final void setName(String name)
 * *. public final void join(long millis) throws InterruptedException
 * *. public static void sleep(long millis) throws InterruptedException
 * *. public static void yield()
 * *. public final boolean isAlive()
 */
public class GeneralMethod extends Thread {
    public static void main(String[] args) {
        ThreadMethod thread = new ThreadMethod();
        /*
        void	setName(String name):
        Changes the name of this thread to be equal to the argument name.
         */
        thread.setName("thread线程1");
        Thread.currentThread().setName("主线程"); // 主线程重命名
        /*
        void start():
        Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
         */
        thread.start();
        thread.start(); // 报错: (同一个对象/线程)start方法不能被重复调用
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "-------->" + i);

            if (i == 20) {
                try {
                    /*
                     * 如果某个线程在另一个线程t上调用t.join(),此线程将被挂起,知道目标线程t结束才恢复(即阻塞调用此方法的线程)
                     * 也可以在调用join()时带上一个超时参数(单位为毫秒),这样如果目标线程在这段时间到期时还没有结束的话,join()方法总能返回
                     */
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(thread.isAlive()); // Tests if this thread is alive.
    }

    @Test
    public void testRun() {
        ThreadMethod thread = new ThreadMethod();
        /*
        void run():
        If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called;
        otherwise, this method does nothing and returns.
         */
        thread.run(); // 注意:只是方法的调用,不能启动线程
    }
}


class ThreadMethod extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                /*
                static void    sleep(long millis):
                Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers.
                 */
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*
             * static Thread    currentThread():
             * Returns a reference to the currently executing thread object.
             *
             * String	getName():
             * Returns this thread's name.
             */
            System.out.println(getName() + ":" + i);

            if (i % 10 == 0) {
                /*
                static void	yield()    yield():
                A hint to the scheduler that the current thread is willing to yield its current use of a processor.
                The scheduler is free to ignore this hint.
                Yield is a heuristic attempt to improve relative progression between threads that would otherwise over-utilise a CPU.
                 */
                this.yield();
            }
        }
    }
}
