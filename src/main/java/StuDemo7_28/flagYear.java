package StuDemo7_28;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

//用时间类 去判断 一个年份是闰年还是平年
public class flagYear {
    public static void main(String[] args) throws ParseException {
        //创建一个Calendar对象
        //jdk 7 0-11月份
        Calendar calendar = Calendar.getInstance();
        //设置时间为2000年2月1日
        calendar.set(2000,2,1);

        //将时间减去一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        //输出减去一天后的日期
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));


        //jdk 8
        //月份  1-12
        //创建一个LocalDate对象，表示2000年3月1日
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        //将日期减去一天
        LocalDate localDate1 = localDate.minusDays(1);
        //获取减去一天后的日期
        int dayOfMonth = localDate1.getDayOfMonth();
        //输出减去一天后的日期
        System.out.println(dayOfMonth);

        /// /////////////////////
        System.out.println(localDate.isLeapYear());
    }
}
