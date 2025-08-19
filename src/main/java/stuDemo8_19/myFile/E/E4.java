package stuDemo8_19.myFile.E;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E4 {

    public static void main(String[] args) {

        HashMap<String, Integer> file = findFile(new File("D:\\code"));
        System.out.println(file);
    }
/**
 * 该方法用于递归遍历指定目录及其子目录，统计其中所有文件的扩展名及其出现次数
 * @param file 要遍历的根目录文件对象
 * @return 返回一个HashMap，键为文件扩展名，值为该扩展名出现的次数
 */
    public static HashMap<String,Integer> findFile(File file){

    // 创建一个HashMap用于存储文件扩展名及其出现次数
        HashMap<String,Integer> hm=new HashMap<>();

    // 获取当前目录下的所有文件和子目录
        File[] files = file.listFiles();

    // 遍历当前目录下的所有文件和子目录
        for (File f : files) {
        // 如果是文件
            if(f.isFile()){
            // 获取文件名
                String name = f.getName();
            // 用点号分割文件名，获取扩展名部分
                String[] arr = name.split("\\.");
            // 确保文件名中包含点号（即有扩展名）
                if(arr.length>=2){
                // 获取最后一个点号后的字符串作为扩展名
                    String str = arr[arr.length - 1];
                // 如果HashMap中已存在该扩展名，则计数加1
                    if(hm.containsKey(str)){
                        Integer integer = hm.get(str);
                        hm.put(str,++integer);
                    }else hm.put(str,1);
                }
            } else if(f.isDirectory()){
                // 递归调用方法处理子目录，获取子目录中的文件扩展名统计结果
                HashMap<String, Integer> sonMap = findFile(f);
                // 遍历子目录返回的统计结果
                Set<Map.Entry<String, Integer>> entries = sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    // 获取扩展名及其出现次数
                    Integer value = entry.getValue();
                    String key = entry.getKey();
                    // 合并当前目录和子目录的统计结果
                    if(hm.containsKey(key)) {
                        Integer i = hm.get(key);
                        hm.put(key, i+value);
                    } else hm.put(key,value);

                }
            }

        }
       // 返回最终的统计结果
       return hm;
    }
}
