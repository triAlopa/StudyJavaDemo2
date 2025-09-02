package stuDemo9_02.MyThreadDemo4;

public class foodie extends Thread {

/**
 * 重写run方法，实现线程的执行逻辑
 * 这是一个消费者类，用于模拟从桌子上取食物并吃食物的过程
 */
    @Override
    public void run() {
    // 无限循环，持续执行消费动作
        while (true) {
        // 使用synchronized关键字确保对共享资源的互斥访问
            synchronized (desk.lock) {
            // 检查桌子上是否还有食物
               if(desk.count==0){
                // 如果没有食物，退出循环
                   break;
               }else {
                // 检查桌子上是否有食物（foodFlag=1表示有食物）
                   if(desk.foodFlag==0){
                    // 如果没有食物，当前线程等待
                       try {
                           desk.lock.wait();
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }else if(desk.foodFlag==1){

                    // 如果有食物，进行消费
                       desk.count--;  // 食物数量减一
                    // 打印消费信息，包括线程名称和剩余食物数量
                       System.out.println(getName()+"正在吃食物 ，还剩"+desk.count+"碗！！");
                    // 唤醒其他等待的线程
                       desk.lock.notifyAll();
                    // 将食物标志重置为0，表示食物已被消费
                       desk.foodFlag=0;
                   }
               }
            }
        }
    }
}
