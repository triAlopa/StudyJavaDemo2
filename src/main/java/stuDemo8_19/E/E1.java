package stuDemo8_19.E;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        while (true) {
            try {
                person p=new person();
                System.out.println("输入姓名");
                String name = sc.nextLine();
                p.setName(name);
                System.out.println("输入年龄");
                String age = sc.nextLine();
                p.setAge(Integer.parseInt(age));
                new person(p.getName(), p.getAge());
                break;
            } catch (NumberFormatException e) {
               e.printStackTrace();
                System.out.println("输入正确格式的年龄");
            }catch (AgeOutBoundsException e){
                e.printStackTrace();
                System.out.println("年龄范围错误");
            }
            catch (NameFormatException e){
                e.printStackTrace();
                System.out.println("姓名长度有误");
            }
        }


    }
}
