package e_concurrency;

/**
 *
 */
public class CooperationBetweenTasksExample {
    public static void main(String[] args) {
        Cleck cl = new Cleck();
        Producer p0 = new Producer(cl);
        p0.setName("生产者0");
        Consumer c0 = new Consumer(cl);
        c0.setName("消费者0");
        p0.start();
        c0.start();
    }
}


class Cleck {
    private int productsNumber = 0;

    // 生产产品
    public synchronized  void produceProduct() { // 同步监视器:cl
        if (productsNumber < 20) {
            productsNumber++;
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
    public synchronized void consumProduct() { // 同步监视器:cl
        if (productsNumber > 0) {
            System.out.println(Thread.currentThread().getName() + "开始消费第" + productsNumber + "个产品");
            productsNumber--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Producer extends Thread {
    private Cleck cleck;

    public Producer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":开始生产产品");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.produceProduct();
        }
    }
}


class Consumer extends Thread {
    private Cleck cleck;

    public Consumer(Cleck cleck) {
        this.cleck = cleck;
    }

    @Override
    public void run() {
        System.out.println(getName() + ":开始消费产品");
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cleck.consumProduct();
        }
    }
}