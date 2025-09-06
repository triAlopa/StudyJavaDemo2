package stuDemo9_06JunitDemo;

import org.junit.jupiter.api.Test;

public class JunitDemo1 {



@Test
    public void method(){
        System.out.println(2/0);
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

    @Test
    public void method1(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }

}
