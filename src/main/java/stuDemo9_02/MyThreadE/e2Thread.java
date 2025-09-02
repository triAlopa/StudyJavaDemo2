package stuDemo9_02.MyThreadE;

public class e2Thread extends Thread {

        static int num=100;

        @Override  // 重写父类或接口的run方法
        public void run(){  // 线程的执行方法
            while (true){  // 无限循环，直到条件满足时退出
                synchronized (e2Thread.class){  // 使用e2Thread类的Class对象作为锁，保证线程安全
                    if(num<=10) break;  // 当票数小于等于10时，退出循环
                    else {  // 当票数大于10时
                        try {  // 异常处理块开始
                            num--;  // 票数减1
                            Thread.sleep(1000);  // 线程休眠1秒
                            System.out.println(getName()+"正在送出去"+num+"张票");  // 打印当前线程和剩余票数信息
                        } catch (InterruptedException e) {  // 捕获线程中断异常
                            e.printStackTrace();  // 打印异常堆栈信息
                        }
                    }
                }
            }
        }
    }

