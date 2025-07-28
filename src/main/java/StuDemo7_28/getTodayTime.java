package StuDemo7_28;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//计算 今天 距离 2000年 1月1日
public class getTodayTime {
    public static void main(String[] args) throws ParseException {
        // Jdk7
        String day=new String("2000年1月1日");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        //将字符串转换为Date类型
        Date date = sdf.parse(day);
        //获取Date类型的毫秒数
        long dateTime = date.getTime();
        //获取当前时间的毫秒数
        long todayTime = System.currentTimeMillis();
        //计算两个时间的差值，单位为天
        int result = (int) ((todayTime - dateTime) / 1000 / 3600 / 24);
        System.out.println(result);


        //Jdk8
        //获取2000年1月1日的日期
        LocalDate date1 = LocalDate.of(2000, 1, 1);
        //获取当前日期
        LocalDate date2 = LocalDate.now();

        //计算两个日期之间的天数差
        long l = ChronoUnit.DAYS.between(date1, date2);
        System.out.println(l);
    }
}
