package StuDemo8_05;


import java.util.Arrays;
import java.util.Comparator;

/*
   定义一些对象 并用数组存储
   要求 1.有姓名，年龄，身高
   2.按年龄大小排序 ，年龄大小一样 按身高大小排序 身高一样 按名字字母排序
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建5个Person对象
        Person p3 = new Person("a", 11, 160);
        Person p4 = new Person("aab", 11, 170);
        Person p1 = new Person("aa", 14, 180);
        Person p5 = new Person("aac", 11, 170);
        Person p2 = new Person("aaa", 16, 160);
        // 将Person对象存储到数组中
        Person[] people = {p1, p2, p3, p4, p5};
        // 调用sortArray方法对数组进行排序
        sortArray(people);
        // 遍历数组并输出排序后的结果
        for (int i = 0; i < people.length; i++) {
            System.out.println("name：" + people[i].getName() + "  age:" + people[i].getAge() + "  height:" + people[i].getHeight());
        }
    }

    //    public static void sortArray(Person[] people){
//        Arrays.sort(people,( o1,  o2)-> {
//            if(o1.getAge()==o2.getAge()){
//                if(o1.getHeight()==o2.getHeight()){return o1.getName().compareTo(o2.getName());}
//                return o1.getHeight()-o2.getHeight();
//            }
//                return o1.getAge()-o2.getAge();
//            }
//        );
//    }
    // 使用lambda表达式对数组进行排序
    public static void sortArray(Person[] people) {
        Arrays.sort(people, (o1, o2) -> {
            // 先按年龄排序
            int temp = o1.getAge() - o2.getAge();
            // 如果年龄相同，则按身高排序
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : 0;
            // 如果身高相同，则按名字排序
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : 0;
            // 返回排序结果
            if (temp > 0) return 1;
            else if (temp < 0) return -1;
            else return 0;
        });
    }
}
