package stuDemo9_02.MyThreadE;

public class E5 {
    public static void main(String[] args) {
        e5Thread t1=new e5Thread();
        e5Thread t2=new e5Thread();
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t2.start();
        t1.start();
    }
}
