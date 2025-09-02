package stuDemo9_02.MyThreadDemo4;

public class cook extends Thread {

    @Override
    public void run() {
        // 使用while(true)循环持续执行，模拟厨师不断做菜的过程
        while (true) {
            // 使用synchronized块确保对共享资源(desk.lock)的互斥访问
            synchronized (desk.lock) {
                // 检查是否还有需要做的菜，如果没有则退出循环
                if (desk.count == 0) break;
                else {
                    // 检查桌子上是否有食物(1表示有，0表示没有)
                    if (desk.foodFlag == 1) {
                        // 如果桌子上已有食物，则厨师等待，直到被消费者唤醒
                        try {
                            desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        // 如果桌子上没有食物，厨师开始做菜
                        System.out.println(getName() + "正在做第" + desk.count + "碗!!!");
                        // 将食物标志设置为1，表示桌子上已有食物
                        desk.foodFlag = 1;
                        // 唤醒所有等待的线程(可能是消费者)
                        desk.lock.notifyAll();
                    }
                }
            }

        }
    }
}
