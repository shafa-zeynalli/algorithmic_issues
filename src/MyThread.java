public class MyThread extends Thread{

    public void run(){
//        System.out.println("Run() is running in:" + Thread.currentThread().getName());
        System.out.println("Thread " + Thread.currentThread().getName() + " is working");
    }
}
