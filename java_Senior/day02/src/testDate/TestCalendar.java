package testDate;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-07 22:18
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(2001,Calendar.FEBRUARY,10,12,23,35);
//        c.set(Calendar.YEAR,2001);
//        c.set(Calendar.MONTH,1);
//        c.set(Calendar.DATE,12);
      //  c.setTime(new Date());
        Date d = c.getTime();
        System.out.println(d);
        System.out.println(c.get(Calendar.YEAR));

        //测试日期计算
        c.add(Calendar.YEAR,30);
        System.out.println(c);

    }
}
