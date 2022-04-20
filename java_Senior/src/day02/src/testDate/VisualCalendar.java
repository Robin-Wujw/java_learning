package testDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

/**
 * 可视化日历程序
 * @Author: Robin_Wujw
 * @Date: 2022-04-08 16:32
 */
public class VisualCalendar {
    public static void main(String[] args) {
        System.out.println("请输入日期(按照格式:2030-3-10):");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int day = calendar.get(Calendar.DATE);
            calendar.set(Calendar.DATE,1);
            System.out.println();
            int maxDate = calendar.getActualMaximum(Calendar.DATE);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            for (int i = 0; i <calendar.get(Calendar.DAY_OF_WEEK)-1; i++) {
                System.out.print("\t");
            }
            int j = 0;
            for (int i = 1; i <=maxDate ; i++) {
                if(i==day){
                    System.out.print("*");
                }
                System.out.print(i + "\t");
                j++;
                int w = calendar.get(Calendar.DAY_OF_WEEK);
                if(w==Calendar.SATURDAY){
                    System.out.print('\n');
                }
                calendar.add(Calendar.DATE,1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
