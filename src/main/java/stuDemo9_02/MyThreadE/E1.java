package stuDemo9_02.MyThreadE;

public class E1 {
    public static void main(String[] args) {
        e1Thread t1=new e1Thread();
        e1Thread t2=new e1Thread();
        t1.setName("窗口一");
        t2.setName("窗口二");


        t1.start();
        t2.start();
    }
}
