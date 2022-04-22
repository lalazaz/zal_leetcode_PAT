package demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

//2022/03/02 17:42:40	部分正确  11	编程题	Java (javac)	119 ms  有点问题

//1026 程序运行时间 (15 分)
public class Demo26 {
    public static void main(String[] args) throws IOException {
        int h_times = 3600;
        int m_times = 60;

        int m_h = 0;
        int m_m = 0;
        int m_s = 0;
        //1.接受两个整数   求他们之间的点数
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("\\s+");
        int C1 = Integer.parseInt(split[0]);
        int C2 = Integer.parseInt(split[1]);
        //2.求秒数，   %100有余数    /100   后+1
        int dots = C2 - C1;
        int times = 0;
        if (dots % 100 != 0){
            times = dots/100 + 1;
        }else {
            times = dots/100;
        }

        /*SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        //df.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        String result =  df.format(times);
        System.out.println(result);*/

        //System.out.println(times);

        String result = null;
        int second = times*1000;
        //System.out.println(second);
        Date date = new Date(second);
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        result =  df.format(date);

        System.out.println(result);
        /*//3.求对应小时、分、秒
        m_h = times/h_times;
        m_s = (times - h_times*m_h)/m_times ;
        m_m = times - h_times*m_h - m_s * m_times;

        String m_h1 = m_h+"";
        String m_s1 = m_s+"";
        String m_m1 = m_m+"";

        if (m_h == 0){
            m_h1 = "00";
        }
        if (m_s == 0){
            m_s1 = "00";
        }
        if (m_m == 0){
            m_s1 = "00";
        }

        //个位数的话前面加一个零

        if (m_h < 10){
            m_h1 = "0"+m_h;
        }
        if (m_s < 10){
            m_s1 = "0"+m_s;
        }
        if (m_m < 10){
            m_m1 = "0"+m_m;
        }

        System.out.print(m_h1);
        System.out.print(":");
        System.out.print(m_s1);
        System.out.print(":");
        System.out.print(m_m1);*/
    }
}
