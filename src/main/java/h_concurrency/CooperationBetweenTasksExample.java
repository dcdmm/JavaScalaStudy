package h_concurrency;

/**
 * 线程之间的协作案例
 */
public class CooperationBetweenTasksExample {
    public static void main(String[] args) {
        Cleck cl = new Cleck();  // 共享资源

        Producer p0 = new Producer(cl);
        p0.setName("生产者-0");

        Producer p1 = new Producer(cl);
        p1.setName("生产者-1");

        Consumer c0 = new Consumer(cl);
        c0.setName("消费者-0");

        Consumer c1 = new Consumer(cl);
        c1.setName("消费者-1");

        Consumer c2 = new Consumer(cl);
        c2.setName("消费者-2");

        p0.start();
        p1.start();
        c0.start();
        c1.start();
        c2.start();
    }
}


/**
 * 店员
 */
class Cleck {
    private int productsNumber = 0;  // 当前店员持有的产品数量
    private int step = 0;

    public int getStep() {
        return step;
    }

    // 生产产品
    public synchronized void produceProduct() {  // 同步监视器:cl(this)
        if (productsNumber < 20) {  // 店员最多只能持有的产品数量为20
            productsNumber++;  // 当前店员持有的产品数量+1
            step++;  // 总的生产的数量+1
            System.out.println(Thread.currentThread().getName() + "开始生产第" + productsNumber + "个产品");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // 消费产品
    public synchronized void consumProduct() {  // 同步监视器:cl(this)
        if (productsNumber > 0) {
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productsNumber + "个产品");
            productsNumber--;  // 当前店员持有的产品数量-1
            notify();  // 唤醒处于等待状态的线程
        } else {
            try {
                wait();  // 线程的执行被挂起,对象上的锁被释放
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/**
 * 生产者===>生产者将产品交给店员
 */
class Producer extends Thread {
    private final Cleck cleck;

    public Producer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {
        while (cleck.getStep() <= 100) {  // 总的生产的数量不能高于100
            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.produceProduct();
        }
    }
}


/**
 * 消费者===>消费者从店员处取走产品
 */
class Consumer extends Thread {
    private final Cleck cleck;

    public Consumer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {
        while (cleck.getStep() <= 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.consumProduct();
        }
    }
}