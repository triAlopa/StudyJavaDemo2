package StuDemo8_13map.treeDemo;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Character,Integer> treeMap=new TreeMap<>();

        String str="abbcddacbdcdabdc";
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if(treeMap.containsKey(charArray[i])){
                Integer integer = treeMap.get(charArray[i]);
                integer++;
                treeMap.put(charArray[i],integer);
            }else treeMap.put(charArray[i],1);
        }

        Set<Map.Entry<Character, Integer>> entries = treeMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.print(key+ "("+value+")");
        }
    }
}
