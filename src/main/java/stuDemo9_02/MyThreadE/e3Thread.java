package stuDemo9_02.MyThreadE;

public class e3Thread extends Thread{
    static int num=100;

    @Override
    public void run(){
        while (true){
            synchronized (e3Thread.class){
                if(num==0) break;
                else {
                    try {
                        num--;
                        Thread.sleep(100);
                        if(num%2==1) System.out.println(getName()+"  "+num);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
