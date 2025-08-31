package stuDemo8_21.E;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class E4 {
/**
 * 主方法：从文件中读取数字字符串，排序后写回文件
 * @param args 命令行参数（未使用）
 * @throws IOException 可能抛出IO异常
 */
    public static void main(String[] args) throws IOException {
    // 创建文件读取器，用于读取指定路径的文件
        FileReader fr = new FileReader("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\a.txt");
        // 使用StringBuilder来高效地构建字符串
        StringBuilder sb = new StringBuilder();
        int a = 0;
        // 循环读取文件中的每个字符，直到文件末尾
        while ((a = fr.read()) != -1) {
            sb.append((char) a);
        }
        // 关闭文件读取器
        fr.close();
    // 将字符串按"-"分割，转换为Integer数组，排序后再转回数组
        Integer[] integers = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

    // 将排序后的数组转换为字符串，并将逗号替换为"-"
        String s = Arrays.toString(integers).replace(", ", "-");
        System.out.println(s);
    // 创建文件写入器，用于将结果写回文件
        FileWriter fw=new FileWriter("D:\\code\\java\\codeStore\\StudyJavaDemo2\\src\\a.txt");
    // 将处理后的字符串写入文件（跳过第一个字符"["和最后一个字符"]"）
        fw.write(s,1,s.length()-1);
        fw.close();
    }
}
