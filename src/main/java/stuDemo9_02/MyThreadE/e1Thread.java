package stuDemo9_02.MyThreadE;

public class e1Thread extends Thread{

    static int ticket=0;

    @Override
    public void run(){
        while (true){
            synchronized (e1Thread.class){
                if(ticket==1000) break;
                else {
                    try {
                        ticket++;
                        Thread.sleep(100);
                        System.out.println(getName()+"正在出售第"+ticket+"张票");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
