package h_concurrency.synchronize;

/**
 * synchronized关键字的特性
 * *. 当线程A访问某对象的synchronized同步代码块(或synchronized同步方法)时,若同步锁未释放,其他线程访问该对象的由该同步锁锁住的synchronized代码块(或synchronized方法)时将被阻塞,直至线程A释放该同步锁
 * *. 当线程A访问某对象的synchronized同步代码块(或synchronized同步方法)时,其他线程仍可以访问该对象的非synchronized同步代码块(或非synchronized同步方法)
 * * * *. 从执行效率的角度考虑,只需对引起线程安全问题的那一部分代码使用synchronized关键字包裹(或封装成synchronized方法)即可
 */
public class SynchronizedFeatures {
    private static class Counter { // 静态内部类
        public void count() {
            synchronized (this) { // synchronized同步代码块;同步锁为当前对象(即Counter类的实例counter)
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "， i = " + i);
                }
            }

            for (int j = 0; j < 100; j++) { // 非synchronized同步代码块
                System.out.println(Thread.currentThread().getName() + "， j = " + j);
            }
        }
    }


    private static class MyThread extends Thread {
        private Counter mCounter;

        public MyThread(Counter counter) {
            mCounter = counter;
        }

        @Override
        public void run() {
            mCounter.count();
        }
    }


    public static void main(String[] var0) {
        Counter counter = new Counter();
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);
        myThread1.start();
        myThread2.start();
    }
}


class SynchronizedFeatures1 {
    private static class Counter { // 静态内部类
        public synchronized void count() { // 锁为当前对象(即Counter类的实例counter)
            System.out.println(Thread.currentThread().getName() + " sleep");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " awake");
        }

        public void doOtherThings() {
            // 若下面this改为Counter.class则为全局锁(锁住整个Class)
            synchronized (this) { // 锁为当前对象(即Counter类的实例counter)
                System.out.println(Thread.currentThread().getName() + " doOtherThings");
            }
        }
    }


    public static void main(String[] var0) {
        /*
        synchronized同步方法count()和doOtherThings()方法中的同步代码块共用一把同步锁(即Counter类的实例counter)
        则只有线程Thread-0释放该同步锁时,Thread-1线程才能从阻塞状态恢复(执行doOtherThings()方法)
        故输出为:
        Thread-0 sleep
        Thread-0 awake
        Thread-1 doOtherThings
         */
        final Counter counter = new Counter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                counter.count();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                counter.doOtherThings();
            }
        }).start();
    }
}