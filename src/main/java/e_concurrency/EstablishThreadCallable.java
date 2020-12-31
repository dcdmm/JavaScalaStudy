package e_concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程的创建(JDK1.5):Callable接口 + FutureTask类
 */
public class EstablishThreadCallable implements Callable<Integer> { // 1. 创建一个实现了Callable(call()方法提供方法定义)方法的类EstablishThreadCallable
    @Override
    public Integer call() {
        // 所要执行的任务指令
        int sum = 0;
        try {
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    sum += i;
                }
            }
        } catch (Exception e) { // 可以抛出或捕获异常
            e.printStackTrace();
        }
        // 自动装箱
        return sum; // 可以有返回值
    }
}


class CallableTest {
    public static void main(String[] args) {
        EstablishThreadCallable etc = new EstablishThreadCallable(); // 2. 创建类EstablishThreadCallable的实例etc
        /*
        FutureTask的构造方法:
        FutureTask(Callable<V> callable)
            Creates a FutureTask that will, upon running, execute the given Callable.

        实现了Runnable, Future<V>接口:
        public class FutureTask<V> implements RunnableFuture<V>
            public interface RunnableFuture<V> extends Runnable, Future<V>
         */
        FutureTask<Integer> ft = new FutureTask<>(etc); // 3. 创建FutureTask类(将etc作为参数传递给构造器)的实例ft
        // FutureTask实现了Runnable接口,故可以传递给Thread类执行
        new Thread(ft).start(); // 4. 创建Thread类(将ft作为参数传递给构造器)的实例
        try {
            /*
            实现自Future接口
            V get() throws InterruptedException, ExecutionException
                Waits if necessary for the computation to complete, and then retrieves its result.
             */
            Integer sum = ft.get(); // 通过get()方法获取类EstablishThreadCallable call()方法的返回值
            System.out.println("总和为" + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
