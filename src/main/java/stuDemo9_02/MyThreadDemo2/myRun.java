package stuDemo9_02.MyThreadDemo2;

public class myRun implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@----"+i);
        }
    }
}
