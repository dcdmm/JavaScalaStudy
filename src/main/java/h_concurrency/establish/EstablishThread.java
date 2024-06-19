package h_concurrency.establish;

/**
 * 线程的创建
 */
public class EstablishThread {
    public static void main(String[] args) {
        /*
        方式2(推荐):
        1. 创建一个实现了Runnable接口(run()方法提供方法定义)方法的类A
        2. 创建类A的实例a
        3. 创建Thread类(将a作为参数传递给构造器)的实例
         */
        EstablishMethodTwo eh_1 = new EstablishMethodTwo();
        /*
        // Thread带有形式参数(Runnable)的构造器;
        public Thread(Runnable target) {
            this(null, target, "Thread-" + nextThreadNum(), 0);
        }
         */
        Thread thread0 = new Thread(eh_1);
        Thread thread1 = new Thread(eh_1);
        /*
        // Thread带有形式参数(Runnable, name)的构造器;
        public Thread(Runnable target, String name) {
            this(null, target, name, 0);
        }
         */
        Thread thread2 = new Thread(eh_1, "@@@@th2@@@@");
        // thread0,thread1,thread2共享eh_1(共享数据)
        thread0.start();
        thread1.start();
        thread2.start();  // 线程不安全(当多个线程并发访问同一个资源对象时,可能会出现线程不安全的问题)
    }
}


class TestEstablishMethodOne {
    public static void main(String[] args) {
        EstablishMethodOne emo1 = new EstablishMethodOne();
        EstablishMethodOne emo2 = new EstablishMethodOne();
        System.out.println("默认线程名称:" + emo1.getName());
        EstablishMethodOne emo3 = new EstablishMethodOne("方式1构造器参数");
        System.out.println("通过构造器自定义的线程名称:" + emo2.getName());
        // emo1,emo2,emo3共享EstablishMethodOne的静态变量ticketi(共享数据)
        emo1.start();
        emo2.start();
        emo3.start();  // 线程不安全(当多个线程并发访问同一个资源对象时,可能会出现线程不安全的问题)
    }
}


class EstablishMethodOne extends Thread {  // 方式1:继承Thread类
    private static int ticket = 20;

    /*
    // Thread无参构造器
    public Thread() {
        this(null, null, "Thread-" + nextThreadNum(), 0);
    }
     */
    public EstablishMethodOne() {
    }

    /*
    // Thread带有形式参数(String)的构造器;
    public Thread(String name) {
        this(null, null, name, 0);
    }
     */
    public EstablishMethodOne(String name) { // name:the name of the new thread
        super(name);
    }

    @Override
    public void run() {  // 不能抛出异常
        // 所要执行的任务指令
        while (ticket > 0) {
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


class EstablishMethodTwo implements Runnable {
    private int ticket = 20;

    @Override
    public void run() {
        // 所要执行的任务指令
        System.out.println("方式2创建线程的run方法");
        while (ticket > 0) {
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