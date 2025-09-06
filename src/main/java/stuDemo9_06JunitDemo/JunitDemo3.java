package stuDemo9_06JunitDemo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class JunitDemo3 {

    @Before
    public void BeforeMethod() throws IOException {
        File src = new File("src/csb.txt");
        File dest = new File("src/csbCopy.txt");

        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest);

        int a=0;
        while ((a=fis.read())!=-1){
            fos.write(a);
        }
        fos.close();
        fis.close();
    }

    @Test
    public void method(){
        File src = new File("src/csb.txt");
        boolean delete = src.delete();
        boolean exists = src.exists();

        Assert.assertEquals("该方法出错了",delete,true);
        Assert.assertEquals("该方法出错了",exists,false);

    }

    @After
    public void afterMethod() throws IOException {
        File src = new File("src/csbCopy.txt");
        File dest = new File("src/csb.txt");

        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(dest);

        int a=0;
        while ((a=fis.read())!=-1){
            fos.write(a);
        }
        fos.close();
        fis.close();


        src.delete();
    }
}
