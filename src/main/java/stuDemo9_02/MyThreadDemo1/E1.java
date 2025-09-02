package stuDemo9_02.MyThreadDemo1;

public class E1  {
/**
 * 程序的主入口方法
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建第一个线程对象
        myThread1 t1=new myThread1();
    // 设置第一个线程的名称
        t1.setName("线程一: ");
    // 创建第二个线程对象
        myThread1 t2=new myThread1();
    // 设置第二个线程的名称
        t2.setName("线程二: ");

    // 启动第一个线程
        t1.start();
    // 启动第二个线程
        t2.start();
    }
}
