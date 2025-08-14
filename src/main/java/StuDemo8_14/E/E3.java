package StuDemo8_14.E;

import java.util.*;

public class E3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "学生1", "学生2", "学生3", "学生4", "学生5", "学生6", "学生7", "学生8", "学生9");
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("=========第"+i+"轮===========================");
            Collections.shuffle(list1);
            Random r = new Random();
            while (!list1.isEmpty()) {
                int index = r.nextInt(list1.size());
                String remove = list1.remove(index);
                list2.add(remove);
                System.out.println(remove);
            }

            list1.addAll(list2);
            list2.clear();

        }
    }
}
