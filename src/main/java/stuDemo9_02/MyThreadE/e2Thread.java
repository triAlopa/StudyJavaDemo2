package stuDemo9_02.MyThreadE;

public class e2Thread extends Thread {

        static int num=100;

        @Override
        public void run(){
            while (true){
                synchronized (e2Thread.class){
                    if(num<=10) break;
                    else {
                        try {
                            num--;
                            Thread.sleep(1000);
                            System.out.println(getName()+"正在送出去"+num+"张票");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

