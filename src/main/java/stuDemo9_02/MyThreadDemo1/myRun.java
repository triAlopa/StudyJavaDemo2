package stuDemo9_02.MyThreadDemo1;

public class myRun implements Runnable{

    @Override
    public void run() {
        //获取 执行线程的对象
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+" Java");
    }
}
