package stuDemo9_02.MyThreadE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class E6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        e6Thread t1=new e6Thread();
        e6Thread t2=new e6Thread();

        FutureTask ft1=new FutureTask(t1);
        FutureTask ft2=new FutureTask(t2);


        Thread T1=new Thread(ft1);
        Thread T2=new Thread(ft2);

        T1.start();
        T2.start();

        Integer i1 = (Integer) ft1.get();
        Integer i2 = (Integer) ft2.get();

        System.out.println(i1+"   "+i2);
    }
}
