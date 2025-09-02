package stuDemo9_02.MyThreadDemo3;

public class E {
    public static void main(String[] args) {
        myThread2 t1=new myThread2();

        myThread2 t2 =new myThread2();

        myThread2 t3 =new myThread2();


        t1.setName("窗口 一");
        t2.setName("窗口 二");
        t3.setName("窗口 三");

        t1.start();
        t2.start();
        t3.start();
    }
}
