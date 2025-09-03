package stuDemo9_02.MyThreadE;

public class E4 {
    public static void main(String[] args) {
        //e4Thread
        e4Thread t1=new e4Thread();
        e4Thread t2=new e4Thread();
        e4Thread t3=new e4Thread();
        e4Thread t4=new e4Thread();
        e4Thread t5=new e4Thread();


        t1.setName("小明");
        t2.setName("小王");
        t3.setName("小江");
        t4.setName("小姚");
        t5.setName("小青");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
