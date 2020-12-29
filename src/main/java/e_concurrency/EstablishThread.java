package e_concurrency;

/**
 * 线程的创建
 * 程序(program):为完成特定任务,用某种语言编写的一组指令的集合(即指一段静态的代码)
 * 进程(process):程序的一次执行过程,或是正在运行的一个程序
 *              是一个动态的过程:有它自身的产生,存在和消亡的过程.
 *              进程作为资源分配的单位,系统运行时会为每个进程进行分配不同的内存区域
 * 线程(thread):进程可进一步细化为线程,是一个程序内部的一条执行路径.
 *             线程作为调度和执行的单位,每个线程拥有独立的运行栈和程序计数器(pc)
 * 并发:一个处理器可以同时处理多个任务.这是逻辑上的同时发生。
 * 并行:多个处理器同时处理多个不同的任务.这是物理上的同时发生
 * A thread is a thread of execution in a program, The Java Virtual Machine allows an application to have multiple threads of execution running concurrently
 */
public class EstablishThread {
    public static void main(String[] args) {
        /*
        方式2(更好,推荐):
        1. 创建一个实现Runnable接口并编程run()方法的类A
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
        thread2.start(); // 线程不安全(当多个线程并发访问同一个资源对象时,可能会出现线程不安全的问题)
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
        emo3.start(); // 线程不安全(当多个线程并发访问同一个资源对象时,可能会出现线程不安全的问题)
    }
}


class EstablishMethodOne extends Thread { // 方式1:继承Thread类
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
    public void run() {
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