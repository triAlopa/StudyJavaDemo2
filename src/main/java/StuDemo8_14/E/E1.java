package StuDemo8_14.E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class E1 {
    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList<>();

        Collections.addAll(arrayList,"学生1","学生2","学生3","学生4","学生5","学生6","学生7","学生8","学生9");

        Random r=new Random();

        for (int i = 0; i < 50; i++) {
            System.out.println(arrayList.get(r.nextInt(arrayList.size())));
        }
    }
}
