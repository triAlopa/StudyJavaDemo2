package StuDemo8_14.E;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class E4 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> arrayListMap=new HashMap<>();
        ArrayList<String> nums=new ArrayList<>();
        nums.add("111");
        nums.add("111");
        nums.add("111");
        nums.add("111");
        arrayListMap.put("1",nums);



    }
}
