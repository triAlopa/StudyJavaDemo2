package stuDemo9_03;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class threadDemo2 {
/**
 * 程序入口方法
 * @param args 命令行参数
 */
    public static void main(String[] args) {
    // 创建一个线程池对象
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,           // 核心线程数：线程池中保持的活跃线程数量
                6,           // 最大线程数：线程池中允许的最大线程数量
                60,          // 空闲线程存活时间：当线程数大于核心线程数时，多余的空闲线程在多长时间后会被终止
                TimeUnit.SECONDS,  // 时间单位：空闲线程存活时间的时间单位（秒）
                new ArrayBlockingQueue<>(3),  // 工作队列：用于存放等待执行的任务，容量为3
                new ThreadPoolExecutor.AbortPolicy()  // 拒绝策略：当线程池和队列都满时，新任务将被拒绝并抛出异常
        );

        int count = Runtime.getRuntime().availableProcessors();
        System.out.println(count);
    }
}
