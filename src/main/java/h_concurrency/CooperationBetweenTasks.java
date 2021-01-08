package h_concurrency;

/**
 * 线程之间的协作
 * Object===>public final void wait() throws InterruptedException:
 * Causes the current thread to wait until it is awakened, typically by being notified or interrupted.
 * <p>
 * Object===>public final void wait(long timeoutMillis, int nanos) throws InterruptedException
 * Causes the current thread to wait until it is awakened, typically by being notified or interrupted, or until a certain amount of real time has elapsed.
 * <p>
 * Object===>public final void notify():
 * Wakes up a single thread that is waiting on this object's monitor. If any threads are waiting on this object, one of them is chosen to be awakened.
 * The choice is arbitrary and occurs at the discretion of the implementation. A thread waits on an object's monitor by calling one of the wait methods.
 * <p>
 * Object===>public final void notifyAll():
 * Wakes up all threads that are waiting on this object's monitor. A thread waits on an object's monitor by calling one of the wait methods.
 */
public class CooperationBetweenTasks implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            /*
            注意:
            1. wait(),notify(),nofityAll()必须使用在synchronized同步代码块(或synchronized同步方法)中
            2. wait(),nofity(),nofityAll()的调用者必须是synchronized同步代码块(或synchronized同步方法)的同步监视器
             */
            synchronized (this) { // 同步监视器:this
                notify(); // 等价于:this.notifyAll()
                // 唤醒处于等待状态的线程
                if (number <= 100) {
                    try {
                        Thread.sleep(100); // 调用sleep()方法时,锁并没有被释放.调用yield也属于这种情况
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait(); // 线程的执行被挂起,对象上的锁被释放
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        CooperationBetweenTasks cbt = new CooperationBetweenTasks();
        Thread thread0 = new Thread(cbt);
        Thread thread1 = new Thread(cbt);
        Thread thread2 = new Thread(cbt);
        thread0.setName("线程一");
        thread1.setName("线程二");
        thread2.setName("线程三");
        thread0.start();
        thread1.start();
        thread2.start();
    }
}
