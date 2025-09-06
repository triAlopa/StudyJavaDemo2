package stuDemo9_04.MyIntDemo.E6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class server {
/**
 * 主方法，创建服务器套接字并使用线程池处理客户端连接
 * @param args 命令行参数
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建服务器套接字，监听10087端口
        ServerSocket ss = new ServerSocket(10087);


    // 创建线程池，参数分别为：
    // 核心线程数3，最大线程数16，线程空闲时间60秒，
    // 时间单位为秒，任务队列容量为3，使用默认线程工厂，
    // 拒绝策略为AbortPolicy（直接抛出异常）
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                3,
                16,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

    // 无限循环，持续接受客户端连接
        while (true) {
        // 接受客户端连接
            Socket s = ss.accept();
        // 将处理客户端连接的任务提交到线程池执行
            pool.submit(new myRunnable(s));
        // 下面这行代码被注释掉，是使用传统方式创建新线程处理连接
//            new Thread(new myRunnable(s)).start();
        }

    }
}
