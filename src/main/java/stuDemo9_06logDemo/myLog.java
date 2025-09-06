package stuDemo9_06logDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class myLog {
    public static final Logger LOGGER = LoggerFactory.getLogger("myLog.class");

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        if("zhangsan".equals(userName)&&"123".equals(password)){
            System.out.println("用户"+userName+"于"+sdf.format(new Date(System.currentTimeMillis()))+"登陆成功");
            LOGGER.info("用户"+userName+"于"+sdf.format(new Date(System.currentTimeMillis()))+"登陆成功");
        }else {
            LOGGER.info("用户"+userName+"于"+sdf.format(new Date(System.currentTimeMillis()))+"登陆失败，密码为"+password);
        }
    }
}
