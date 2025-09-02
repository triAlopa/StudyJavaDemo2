package stuDemo9_02.MyThreadDemo2;

public class E2 {
    public static void main(String[] args) {
        myRun mr=new myRun();

        Thread t1=new Thread(mr,"飞机");
        Thread t2=new Thread(mr,"坦克");

        t1.setPriority(10);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
