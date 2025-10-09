public class NotifyAllExample {
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable waiter = () -> {
            synchronized (lock){
                System.out.println(Thread.currentThread().getName() + " gözləyir");

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println(Thread.currentThread().getName() + " oyandi");
            }
        };

        Thread t1 = new Thread(waiter, "T1");
        Thread t2 = new Thread(waiter, "T2");
        Thread t3 = new Thread(waiter, "T3");

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(2000);

        synchronized (lock){
            System.out.println("hamisini oyatdim");
            lock.notifyAll();
        }
    }
}
