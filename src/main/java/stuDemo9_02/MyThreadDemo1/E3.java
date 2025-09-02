package stuDemo9_02.MyThreadDemo1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class E3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        myCallable mc= new myCallable();

        FutureTask<Integer> ft=new FutureTask<>(mc);

        Thread t=new Thread(ft);

        t.start();

        Integer integer = ft.get();
        System.out.println(integer);
    }
}
