package stuDemo8_31.print;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printfWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw =new PrintWriter(new FileWriter("src/a.txt"),true);
        pw.println(11);
        pw.close();
    }
}
