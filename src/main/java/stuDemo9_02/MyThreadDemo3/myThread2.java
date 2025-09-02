package stuDemo9_02.MyThreadDemo3;

public class myThread2 extends Thread {

    static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (ticket != 100) {
//                synchronized (myThread2.class) {
//
//                }
                method();
            } else break;
        }
    }

    public synchronized void method (){
        ticket++;
        System.out.println(getName() + "正在卖第" + ticket + "张票");
    }
}
