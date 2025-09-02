package stuDemo9_02.MyThreadDemo1;


/**
 * 这是一个演示多线程实现的示例类
 * 通过实现Runnable接口来创建并启动线程
 */
public class E2 {
    //先实现 runnable 接口，重写其执行代码 在run函数体里面
    public static void main(String[] args) {
        //创建执行任务的对象
        myRun mr= new myRun();
        //将任务放进线程
        Thread t1=new Thread(mr);
        Thread t2=new Thread(mr);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
