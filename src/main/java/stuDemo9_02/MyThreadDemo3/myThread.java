package stuDemo9_02.MyThreadDemo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

public class myThread extends Thread {
    static int ticket = 0;

    //对于多线程抢占共同资源
    //单线程抢占 要上锁
    static Object object = new Object();
    static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {

        // 重写run方法，这是线程执行的主体方法
        while (true) {
//            synchronized (object) {
            lock.lock();

            try {
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "正在出售第" + (ticket) + "张票");
                } else break;
               Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {

                lock.unlock();
            }
        }
//            }

    }
}
