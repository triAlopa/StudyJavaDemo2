package stuDemo9_02.MyThreadE;

public class E2 {
    public static void main(String[] args) {
        e2Thread t1=new e2Thread();
        e2Thread t2=new e2Thread();
        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
