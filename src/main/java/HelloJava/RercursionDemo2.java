package HelloJava;

import java.lang.reflect.Method;

public class RercursionDemo2 {
    public static void main(String[] args) {
        int num=5;
        int result= method(num);
        System.out.println(result);
    }

    private static int method(int num) {
        if(num==1) return 1;
        return num*method(num-1);
    }
}
