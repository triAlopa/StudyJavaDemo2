package StuDemo8_04.Util;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayUtilDemo1 {
    public static void main(String[] args) {
        String[] strings={"h","e","l","l","o"};
        String str = Arrays.toString(strings);
        System.out.println(str);

        int[] ints={1,2,3,7,8,9,10};
        System.out.println(Arrays.binarySearch(ints, 1));

        String[] copy = Arrays.copyOf(strings, 7);
        System.out.println(Arrays.toString(copy));


        Arrays.fill(copy,"nullo");
        System.out.println(Arrays.toString(copy));

        Integer[] intss={1,2,5,0,3,7,8,9,10};
        Arrays.sort(intss);
        System.out.println(Arrays.toString(intss));
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };
        Arrays.sort(intss,comparator);
        System.out.println(Arrays.toString(intss));

        Arrays.sort(intss, ( o1,  o2)-> o2-o1);
    }
}
