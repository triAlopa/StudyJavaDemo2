package stuDemo9_02.MyThreadE;

public class e3Thread extends Thread{
    static int num=100;

    @Override  // 重写父类或接口的run方法
    public void run(){  // 线程的运行方法
        while (true){  // 无限循环，直到num为0时退出
            synchronized (e3Thread.class){  // 使用e3Thread.class作为锁对象，确保线程同步
                if(num==0) break;  // 如果num为0，则跳出循环
                else {  // 否则执行以下操作
                    try {  // 异常处理块
                        num--;  // num自减1
                        Thread.sleep(100);  // 当前线程休眠100毫秒
                        if(num%2==1) System.out.println(getName()+"  "+num);  // 如果num为奇数，打印线程名和num值
                    } catch (InterruptedException e) {  // 捕获线程中断异常
                        e.printStackTrace();  // 打印异常堆栈信息
                    }
                }
            }
        }
    }
}
