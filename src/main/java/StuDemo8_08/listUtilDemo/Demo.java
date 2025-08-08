package StuDemo8_08.listUtilDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String[] strings=new String[]{"111","222","3333","44444"};
        ArrayList<String> arrayList=new ArrayList<>();
        MylistUtil.addAll(arrayList,strings,2,3);
        System.out.println(arrayList);
    }
}
