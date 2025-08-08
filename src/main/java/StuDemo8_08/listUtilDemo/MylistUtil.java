package StuDemo8_08.listUtilDemo;


import java.util.ArrayList;

public class MylistUtil {
    private MylistUtil(){};


    public static<E> void addAll(ArrayList<E> list,E[] es,int start,int end){
        if(start>=end) new Exception();
        for (int i = start; i < end; i++) {
            list.add(es[i]);
        }
    }
}
