package StuDemo8_14.E;

import java.util.*;

public class E2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        String[] arr = {"男", "女"};
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            String name = "学生" + i;
            String sex = arr[r.nextInt(arr.length)];
            hashMap.put(name, sex);
        }
        String str = "1111111000";
        String c = str.charAt(r.nextInt(str.length())) + "";
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            if("1".equals(c))  {
                if(entry.getValue().equals("男")) {
                    System.out.println("抽到了男生");
                    System.out.println("name " + entry.getKey());
                    break;
                }
            }
        }
    }
}
