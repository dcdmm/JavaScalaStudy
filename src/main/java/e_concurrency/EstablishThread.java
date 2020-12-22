package e_concurrency;

/**
 * 线程的创建
 * 程序(program):为完成特定任务,用某种语言编写的一组指令的集合.即指一段静态的代码
 * 进程(process):程序的一次执行过程,或是正在运行的一个程序.是一个动态的过程:有它自身的产生,存在和消亡的过程.进程作为资源分配的单位,系统运行时会为每个进程进行分配不同的内存区域
 * 线程(thread):进程可进一步细化为线程,是一个程序内部的一条执行路径.线程作为调度和执行的单位,每个线程拥有独立的运行栈和程序计数器(pc)
 * 并发:一个处理器可以同时处理多个任务.这是逻辑上的同时发生。
 * 并行:多个处理器同时处理多个不同的任务.这是物理上的同时发生
 * A thread is a thread of execution in a program, The Java Virtual Machine allows an application to have multiple threads of execution running concurrently
 */
public class EstablishThread extends Thread { // 方式1:继承Thread类

    /*
    // Thread无参构造器
    public Thread() {
        this(null, null, "Thread-" + nextThreadNum(), 0);
    }
     */
    public EstablishThread() {
    }

    /*
    // Thread带有形式参数(String)的构造器;
    public Thread(String name) {
        this(null, null, name, 0);
    }
     */
    public EstablishThread(String name) { // name:the name of the new thread
        super(name);
    }

    @Override
    public void run() {
        // 所要执行的任务指令
        System.out.println("方式1创建线程的run方法");
    }
}


class EstablishThread1 implements Runnable {
    private int ticket = 20;

    @Override
    public void run() {
        // 所要执行的任务指令
        System.out.println("方式2创建线程的run方法");
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + ": " + ticket);
            ticket--;
        }
    }
}


class EstablishThreadTest {
    public static void main(String[] args) {
        EstablishThread eh0 = new EstablishThread();
        System.out.println(eh0.getName()); // 默认线程名称
        EstablishThread eh1 = new EstablishThread("自定义线程名称"); // 通过构造器自定义线程名称
        System.out.println(eh1.getName());
        System.out.println("**************************************************");
        /*
        方式2(优先):
        1. 创建一个实现Runnable接口并编程run()方法的类A
        2. 创建类A的实例a
        3. 创建Thread类(将a作为参数传递给构造器)的实例
         */
        EstablishThread1 eh2 = new EstablishThread1();
        /*
        // Thread带有形式参数(Runnable)的构造器;
        public Thread(Runnable target) {
            this(null, target, "Thread-" + nextThreadNum(), 0);
        }
         */
        Thread thread0 = new Thread(eh2);
        /*
        // Thread带有形式参数(Runnable, name)的构造器;
        public Thread(Runnable target, String name) {
            this(null, target, name, 0);
        }
         */
        Thread thread1 = new Thread(eh2, "@@@@th2@@@@");
        // thread0,thread1共享eh2
        thread0.start();
        thread1.start();
    }
}
