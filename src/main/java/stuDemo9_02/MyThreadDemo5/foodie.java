package stuDemo9_02.MyThreadDemo5;

import java.util.concurrent.ArrayBlockingQueue;

public class foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String take = (String) queue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
