public class Main {

    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
//        MyThread t1 = new MyThread();
        //t.run();//Bu kod main metodunun içində yazılıb. main() metodunun işlədiyi thread də "main" adlanır. Ona görə də:
        //nəticə "main" olur. Çünki run() heç bir yeni thread yaratmır — onu main thread icra edir.
//        t1.start();// Yeni thread yaradılır
//        System.out.println("Main is running in:" + Thread.currentThread().getName());

//        MyThread t2 = new MyThread();
//        MyThread t3 = new MyThread();
//
//        t1.run();
//        t1.start();
//        t2.start();
//        t3.start();





//        System.out.println("1-Start");
//
//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            System.out.println("Interrupted");
//        }
//
//        System.out.println("2-End");
        //Yuxaridaki kodda Konsolda 3 saniyəlik pauza olacaq. Bu zamanı kod dayandırılır, CPU başqa işlə məşğul ola bilər.





//        Thread t1 = new Thread(() -> {
//            try {
//                Thread.sleep(2000);
//                System.out.println("Thread 1 bitdi");
//            }catch (InterruptedException e){}
//        });
//        Thread t2 = new Thread(() -> {
//            try {
//                Thread.sleep(1000);
//                System.out.println("Thread 2 bitdi");
//            }catch (InterruptedException e){}
//        });
//
//        t1.start();
//        t2.start();
        //Nəticə nə olacaq? Thread-2 sleep muddeti az oldugu üçün birinci bitəcək, sonra Thread-1.

//        Thread t = new Thread(() -> {
//            for (int i=0; i<5; i++){
//                System.out.println("Thread: " + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {}
//            }
//        });
//
//        t.start();
//        t.join(); // main gözləyir
//
//        System.out.println("main davam etdi");
        //t.join() çağırıldıqda, main thread t-nin işini bitirməsini gözləyir. Əgər join() olmasa idi, main sona çata bilərdi t-dən əvvəl sonra t ishe duserdi.



//        Runnable task = () -> {
//            for (int i = 0; i < 100000; i++) {
//                increment();
//                try {
//                    Thread.sleep(1); // Yavaşladram ki, race olsun
//                } catch (InterruptedException e) {}
//            }
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//        Thread t3 = new Thread(task);
//        Thread t4 = new Thread(task);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//
//        System.out.println("Counter = " + counter);
    }

    public synchronized static void increment() {
        counter++;
    }
}