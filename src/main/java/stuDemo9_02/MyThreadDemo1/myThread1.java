package stuDemo9_02.MyThreadDemo1;

public class myThread1 extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+" Hello,world");
        }
    }
}
