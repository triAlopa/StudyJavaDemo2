package stuDemo9_02.MyThreadDemo4;

public class desk {
    //准备食物状态
    //1 桌子上有食物
    public static int foodFlag=0;

    //
    public static Object lock=new Object();

    //线程执行次数
    public static int count=10;
}
