package StuDemo8_04.Util;

import java.util.Arrays;
import java.util.Comparator;

public class lambdaDemo {
    public static void main(String[] args) {
        String[] strings = {"hello", "world", "java"};
        //匿名内部类写法
//        Arrays.sort(strings, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
        //lambda写法
        Arrays.sort(strings, (String o1, String o2) -> {
                    return o1.length() - o2.length();
                }
        );

        //lambda简略写法
        Arrays.sort(strings, (String o1,String o2)->o2.length()-o1.length());
        System.out.println(Arrays.toString(strings));
    }
}
