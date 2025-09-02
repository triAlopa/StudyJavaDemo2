package stuDemo9_02.MyThreadE;

public class e1Thread extends Thread{

    static int ticket=0;

    @Override  // 重写父类或接口中的run方法
    public void run(){  // 线程的运行方法
        while (true){  // 无限循环，持续售票
            synchronized (e1Thread.class){  // 使用e1Thread.class作为锁对象，确保线程安全
                if(ticket==1000) break;  // 如果票已售完（达到1000张），则退出循环
                else {  // 否则继续售票
                    try {
                        ticket++;  // 票数加1
                        Thread.sleep(100);  // 线程休眠100毫秒，模拟售票耗时
                        System.out.println(getName()+"正在出售第"+ticket+"张票");  // 打印当前线程售票信息
                    } catch (InterruptedException e) {  // 捕获线程中断异常
                        e.printStackTrace();  // 打印异常堆栈信息
                    }
                }
            }
        }
    }
}
