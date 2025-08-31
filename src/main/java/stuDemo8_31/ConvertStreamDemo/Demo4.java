package stuDemo8_31.ConvertStreamDemo;

import java.io.*;

public class Demo4 {
    FileInputStream fis=new FileInputStream("src/a.txt");
    InputStreamReader isr=new InputStreamReader(fis);
    BufferedReader fr=new BufferedReader(isr);

    public Demo4() throws FileNotFoundException {
    }
}
