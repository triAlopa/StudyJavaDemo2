package StuDemo8_08.arrayListDemo;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        MyArrayListDemo1<String> myArrayListDemo1=new MyArrayListDemo1<>();
        myArrayListDemo1.add("111");
        myArrayListDemo1.add("222");
        myArrayListDemo1.add("333");
        System.out.println(myArrayListDemo1.toString());
        System.out.println(myArrayListDemo1.get(1));
        myArrayListDemo1.del(2);
        System.out.println(myArrayListDemo1.toString());
    }
}
