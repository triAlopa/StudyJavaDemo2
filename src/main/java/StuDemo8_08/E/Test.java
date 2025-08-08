package StuDemo8_08.E;

import java.util.ArrayList;

/**
 * 测试类，用于演示泛型和继承的使用
 */
public class Test {
    /**
     * 程序入口点
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建一个猫的ArrayList集合
        ArrayList<cat> cats=new ArrayList<>();
        // 创建一只狸花猫实例
        lihuaCat lihuaCat=new lihuaCat("11",12);
        // 创建一只波斯猫实例
        bociCat bociCat=new bociCat("771",12);
        // 将猫添加到集合中
        cats.add(lihuaCat);
        cats.add(bociCat);
        // 调用养猫方法
        keepPet(cats);
    }
    /**
     * 养猫方法，可以喂养任何猫的子类
     * @param cats 猫的集合，使用通配符? extends cat表示可以接受cat或其子类的集合
     */
    public static void keepPet(ArrayList<? extends cat> cats){
        // 遍历猫的集合
        for (int result = 0; result < cats.size(); result++) {
            // 获取每只猫
            cat cat = cats.get(result);
            // 让每只猫吃东西
            cat.eat();
        }
    }
}
