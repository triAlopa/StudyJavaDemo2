package stuDemo9_03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool1 = Executors.newCachedThreadPool();

//        Thread.sleep(1000);
//        pool1.submit(new myRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new myRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new myRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new myRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new myRunnable());


        ExecutorService pool2 = Executors.newFixedThreadPool(3);
        pool2.submit(new myRunnable());
        pool2.submit(new myRunnable());
        pool2.submit(new myRunnable());
        pool2.submit(new myRunnable());

        pool2.shutdown();
    }
}
