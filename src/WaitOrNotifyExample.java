public class WaitOrNotifyExample {

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread waiter = new Thread(() -> {
            synchronized (lock){
                System.out.println("Waiter: Gözləyirəm");
                try {
                    lock.wait();
                } catch (InterruptedException e) {}
                System.out.println("Oyanmisham");
            }
        });

        Thread notifier = new Thread(() -> {
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            synchronized (lock){
                System.out.println("Notifier: Oyatdim");
                lock.notify();
            }
        });

        waiter.start();
        notifier.start();
    }
}
