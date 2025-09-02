package stuDemo9_02.MyThreadE;

public class E3 {
    public static void main(String[] args) {
        e3Thread t1=new e3Thread();
        e3Thread t2=new e3Thread();
        t1.setName("窗口一");
        t2.setName("窗口二");

        t1.start();
        t2.start();
    }
}
