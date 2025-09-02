package stuDemo9_02.MyThreadDemo2;

public class E1 {
/**
 * 主方法，程序的入口点
 * @param args 命令行参数
 */
    public static void main(String[] args) {

        myThread mt = new myThread();
        System.out.println(mt.getName());//Thread-0
        mt.setName("线程一 ");
        System.out.println(mt.getName());//线程一

        System.out.println(Thread.currentThread().getName());//main 主函数线程

        mt.start();


    }
}
