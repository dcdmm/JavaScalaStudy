package e_concurrency;

import java.util.concurrent.*;

/**
 * 线程的创建:线程池
 * public class ThreadPoolExecutor extends AbstractExecutorService
 * * 属性设置/获取
 * * public void setMaximumPoolSize(int maximumPoolSize)
 * * public int getMaximumPoolSize()
 * * public void setCorePoolSize(int corePoolSize)
 * * public int getCorePoolSize()
 * * public void setThreadFactory(ThreadFactory threadFactory)
 * * public ThreadFactory getThreadFactory()
 * * public void setKeepAliveTime(long time, TimeUnit unit)
 * * public long getKeepAliveTime(TimeUnit unit)
 * <p>
 * public abstract class AbstractExecutorService implements ExecutorService
 * <p>
 * public interface ExecutorService extends Executor
 * * <T> Future<T> submit(Callable<T> task)
 * * void shutdown()
 * <p>
 * public interface Executor
 * * public void execute(Runnable command)
 */
public class EstablishThreadPool {
    public static void main(String[] args) {
        /*
        public static ExecutorService newFixedThreadPool(int nThreads)
            Creates a thread pool that reuses a fixed number of threads operating off a shared unbounded queue
        Parameters:
            nThreads - the number of threads in the pool
        Returns:
            the newly created thread pool
         */
        ExecutorService service = Executors.newFixedThreadPool(10);// 该池包含固定数量的线程;空闲线程会一直保留
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service; // 向下转型
        System.out.println(service == service1); // 同一个引用地址
        /*
        ThreadPoolExecutor类中定义
        public void setMaximumPoolSize(int maximumPoolSize)
            Sets the maximum allowed number of threads.
            This overrides any value set in the constructor.
            If the new value is smaller than the current value, excess existing threads will be terminated when they next become idle.
         */
        service1.setMaximumPoolSize(21);
        System.out.println(service1.getMaximumPoolSize()); // Returns the maximum allowed number of threads.

        service.execute(() -> {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        /*
        Executor接口中定义
        public void execute(Runnable command)
            Executes the given task sometime in the future
         */
        service.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                    }
                }
            }
        }); // 没有返回值

        /*
        ExecutorService接口中定义
        <T> Future<T> submit(Callable<T> task)
            Submits a value-returning task for execution and returns a Future representing the pending results of the task.
            The Future's get method will return the task's result upon successful completion.
         */
        Future<Integer> f = service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i = 0; i < 100; i++) {
                    if (i % 10 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + i);
                        sum += i;
                    }
                }
                return sum;
            }
        }); // 返回一个Future对象

        int the_sum = 0;
        try {
            the_sum = f.get(); // Waits if necessary for the computation to complete, and then retrieves its result.
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(the_sum);

        /*
        ExecutorService接口中定义
        void shutdown()
            Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted.
            Invocation has no additional effect if already shut down.
         */
        service.shutdown(); // 关闭服务,会先完成已经提交的任务而不再接受新的任务
    }
}
