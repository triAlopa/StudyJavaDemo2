package stuDemo8_31.BufferDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MuBufferDemo4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("src/d.txt"));
        bw.write("学习");
        bw.newLine();
        bw.write("java,");
        bw.close();
    }
}
