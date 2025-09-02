package stuDemo9_02.MyThreadDemo5;

import java.util.concurrent.ArrayBlockingQueue;

public class cooker extends Thread {
    ArrayBlockingQueue<String> queue;

    public cooker(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put("面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
