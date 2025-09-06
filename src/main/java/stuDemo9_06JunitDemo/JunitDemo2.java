package stuDemo9_06JunitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitDemo2 {



    public static void main(String[] args) {
        Junit j=new Junit();
        int result = j.method1();

        Assertions.assertEquals(result,12,"该方法出错了");
    }
}
