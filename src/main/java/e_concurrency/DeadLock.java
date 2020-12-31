package e_concurrency;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 死锁
 * 当以下四个条件同时满足时,就会发生死锁
 * 1. 互斥条件,任务使用的资源中至少有一个是不能共享的
 * 2. 至少有一个任务它必须持有一个资源且正在等待获取一个当前别的任务持有的资源
 * 3. 资源不能被任务抢占,任务必须把资源释放当作普通事件
 * 4. 必须有循环等待,这时,一个任务等待其他任务持有的资源,后者又在等待另一个任务所持有的资源,这样一直下去,直到有一个任务在等待第一个任务所持有的资源,使得大家都被锁住
 */
public class DeadLock { // 死锁案例1
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        new Thread(() -> {
            synchronized (sb1) { // 同步监视器:sb1
                sb1.append('a');
                sb2.append('1');
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (sb2) { // 同步监视器:sb2
                    sb1.append('b');
                    sb2.append('2');

                    System.out.println(sb1);
                    System.out.println(sb2);
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sb2) { // 同步监视器:sb2
                    sb1.append('c');
                    sb2.append('3');
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (sb1) { // 同步监视器:sb1
                        sb1.append('d');
                        sb2.append('4');

                        System.out.println(sb1);
                        System.out.println(sb2);
                    }
                }
            }
        }).start();
    }
}


class DeadLockReentrantLock { // 死锁案例2(通过ReentrantLock类)
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();
        new Thread(() -> {
            lock1.lock();
            try {
                str1.append('a');
                str2.append('1');
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock2.lock();
                try {
                    str1.append('b');
                    str2.append('2');

                    System.out.println(str1);
                    System.out.println(str2);
                } finally {
                    lock2.unlock();
                }
            } finally {
                lock1.unlock();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                lock2.lock();
                try {
                    str1.append('c');
                    str2.append('3');
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock1.lock();
                    try {
                        str1.append('d');
                        str2.append('4');

                        System.out.println(str1);
                        System.out.println(str2);
                    } finally {
                        lock1.unlock();
                    }
                } finally {
                    lock2.unlock();
                }
            }
        }).start();
    }
}


class DeadLockA {
    public synchronized void foo(DeadLockB b_obj) { // 同步监视器:当前对象--->实例a
        System.out.println(Thread.currentThread().getName() + "进入了DeadLockA实例的foo方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "企图调用DeadLockB实例的last方法");
        b_obj.last();
    }

    public synchronized void last() { // 同步监视器:当前对象--->实例a
        System.out.println("进入了DeadLockA实例的last方法");
    }
}


class DeadLockB {
    public synchronized void bar(DeadLockA a_obj) { // 同步监视器:当前对象--->实例b
        System.out.println(Thread.currentThread().getName() + "进入了DeadLockB实例的bar方法");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "企图调用DeadLockA实例的last方法");
        a_obj.last();
    }

    public synchronized void last() { // 同步监视器:当前对象--->实例b
        System.out.println("进入了DeadLockB实例的last方法");
    }
}


class DeadLockABTest implements Runnable { // 死锁案例3
    DeadLockA a = new DeadLockA();
    DeadLockB b = new DeadLockB();

    public void init() {
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入主线程之后");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入副线程之后");
    }

    public static void main(String[] args) {
        DeadLockABTest dlt = new DeadLockABTest();
        new Thread(dlt).start(); // Causes this thread to begin execution
        dlt.init();
        /*
        // 此时不会发生死锁,因为主线程执行完后副线程才被启动
        dlt.init();
        new Thread(dlt).start();
        */
    }
}