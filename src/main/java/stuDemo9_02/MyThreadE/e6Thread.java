package stuDemo9_02.MyThreadE;

import java.security.interfaces.ECKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class e6Thread implements Callable<Integer> {
    static ArrayList<Integer> list = new ArrayList<>();
//    static ArrayList<Integer> list1 = new ArrayList<>();
//    static ArrayList<Integer> list2 = new ArrayList<>();

    static {
        Collections.addAll(list, 10, 5, 20, 50, 100, 500, 800, 2, 80, 300, 700);
    }

//    @Override
//    public void run()   {
//        while (true) {
//            synchronized (e6Thread.class) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                if (list.isEmpty()) {
//                    if(Thread.currentThread().getName().equals("抽奖箱1")){
//                        int sum=0;
//                        System.out.println(Thread.currentThread().getName()+"一共抽到了"+list1.size()+"个奖项");
//                        for (Integer i : list1) {
//                            sum=sum+i;
//                            System.out.print(i+" ");
//                        }
//                        Collections.sort(list1);
//                        System.out.println("MAX: "+list1.get(list1.size()-1));
//                        System.out.println("共计"+sum);
//                    }else {
//                        System.out.println(Thread.currentThread().getName()+"一共抽到了"+list2.size()+"个奖项");
//                        for (Integer i : list2) {
//                            System.out.print(i+" ");
//                        }
//                        Collections.sort(list2);
//                        System.out.println("MAX: "+list2.get(list2.size()-1));
//                    }
//                    break;
//                }
//                else {
//                    Collections.shuffle(list);
//                    Integer remove = list.remove(0);
//                    if(Thread.currentThread().getName().equals("抽奖箱1")){
//                        list1.add(remove);
//                    }else {
//                        list2.add(remove);
//                    }
//                }
//            }
//        }
//    }

    @Override
    /**
     * 重写call方法，实现Callable接口的call方法
     * @return 返回Integer类型的结果，可能是null也可能是最大值
     * @throws Exception 可能抛出异常
     */
    public Integer call() throws Exception {
        // 创建一个ArrayList用于存储从列表中移除的元素
        ArrayList<Integer> boxList = new ArrayList<>();
        // 无限循环，直到满足条件才会退出
        while (true){
            // 线程休眠100毫秒，减少CPU负担
            Thread.sleep(100);
            // 使用synchronized关键字确保线程安全，锁定e6Thread.class对象
            synchronized (e6Thread.class){
                // 检查列表是否为空
                if(list.isEmpty()) {
                    // 打印当前线程名称和boxList的内容，然后跳出循环
                    System.out.println(Thread.currentThread().getName() + boxList);
                    break;
                }
                // 如果列表不为空
                else {
                    // 打乱列表顺序，随机排列
                    Collections.shuffle(list);
                    // 移除列表的第一个元素并添加到boxList中
                    Integer remove = list.remove(0);
                    boxList.add(remove);
                }
            }
        }
        // 检查boxList是否为空，为空则返回null
        if(boxList.isEmpty()) return null;
        // 否则返回boxList中的最大值
        else return Collections.max(boxList);
    }
}
