package stuDemo9_02.MyThreadDemo2;

public class myThread extends Thread {

    public myThread() {
        super();
    }

    public myThread(String name) {
        super(name);
    }

    @Override
    public void run(){ // 重写run方法，这是线程执行的主体方法

        Thread t = Thread.currentThread(); // 获取当前正在执行的线程对象

        for (int i = 0; i < 100; i++) { // 循环100次
            try {
                Thread.sleep(1000); // 使当前线程休眠1秒
            } catch (InterruptedException e) { // 捕获线程中断异常
                throw new RuntimeException(e); // 将中断异常转换为运行时异常抛出
            }
            System.out.println(t.getName()+" @"); // 打印当前线程的名称和"@"符号
        }
    }
}
