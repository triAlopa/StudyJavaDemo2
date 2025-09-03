package stuDemo9_02.MyThreadE;

import java.util.ArrayList;
import java.util.Collections;

public class e5Thread extends Thread {
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        Collections.addAll(list, 10, 5, 20, 50, 100, 500, 800, 2, 80, 300, 700);
    }

    @Override
    public void run() {
        // 使用无限循环来持续执行抽奖逻辑
        while (true) {
            // 使用synchronized关键字确保线程安全，锁定E5Thread类的Class对象
            synchronized (e5Thread.class) {
                // 检查抽奖列表是否为空，如果为空则退出循环
                if (list.isEmpty()) break;
                else {
                    try {
                        // 线程休眠3秒，模拟抽奖间隔
                        Thread.sleep(3000);
                        // 打乱列表顺序，确保随机性
                        Collections.shuffle(list);
                        // 从列表开头移除一个元素，即获取一个抽奖结果
                        Integer remove = list.remove(0);
                        // 打印线程名称和中奖金额信息
                        System.out.println(getName()+"又产生了一个"+remove+"元大奖");
                    } catch (InterruptedException e) {
                        // 处理线程中断异常，并将其转换为运行时异常
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
