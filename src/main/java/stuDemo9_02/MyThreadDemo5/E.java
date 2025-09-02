package stuDemo9_02.MyThreadDemo5;

import java.util.concurrent.ArrayBlockingQueue;

public class E {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue =new ArrayBlockingQueue<>(1);
        foodie f=new foodie(queue);
        cooker c=new cooker(queue);


        f.start();
        c.start();
    }
}
