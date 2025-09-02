package stuDemo9_02.MyThreadDemo1;

import java.util.concurrent.Callable;

public class myCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
