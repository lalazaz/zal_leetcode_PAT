package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2022/03/01 20:04:16	部分正确   14	编程题	Java (javac)	106 ms   其实也有API方法 toPlainString()
//1024 科学计数法 (20 分)
public class Demo24 {
    public static void main(String[] args) throws IOException {

        StringBuilder res = new StringBuilder("");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] split = line.split("E");
        //得到spilt[0]、与spilt[1]     再拿出他们的符号
        String substring1 = split[0].substring(0, 1);
        String substring2 = split[0].substring(1);
        //把第二字符的.去掉
        String substring21 = substring2.replace(".","");
        //System.out.println(substring21);
        String substring3 = split[1].substring(0,1);
        String substring4 = split[1].substring(1);

        if (substring3.equals("-")){
            //第三个符号是减号,则是0.开头
            res.append("0.");
            for (int i = Integer.parseInt(substring4)-1; i != 0 ; i--) {
                res.append("0");
            }
            res.append(substring21);
        }else if (substring3.equals("+")){
            //第三个符号是加号,则判断第四个整数大小与第二位数字小数点后面之间的关系
            if (substring2.length()>Integer.parseInt(substring4)){
                //第二位整数长度大于第四位   则小数点往右边移动
                double pow = Math.pow(10, Double.parseDouble(substring4));
                 double pow1 = Double.parseDouble(substring2)*pow;
                res.append(pow1);
                int x = substring2.length()-2-Integer.parseInt(substring4);
                for (int i = 0; i < x-1; i++) {
                    res.append("0");
                }
            }else if (substring2.length()<=Integer.parseInt(substring4)){
                //第二位整数长度小于等于第四位大小  是整数  以及补零操作
                //判断他的长度   -2
                //首先移除他的小数点
                int x = substring2.length()-2;
                String substring22 = substring2.replace(".", "");
                res.append(substring22);
                //在此基础上判断是否要加0
                for (; x < Integer.parseInt(substring4); x++) {
                    res.append("0");
                }
            }
        }
        //输出第一位符号判断是+的话就不输出
        if (substring1.equals("-")){
            System.out.print(substring1);
            System.out.println(res);
        }else {
            System.out.println(res);
        }


        //以下做法很难控制精度
        //对第三个字符进行判断，"+"则为pow(10,substring4) "-"则为pow(0.1,substring4)
        /*if (substring3.equals("+")){
            res = Double.parseDouble(substring2)*Math.pow(10,Integer.parseInt(substring4));
        }else if (substring3.equals("-")){
            res = Double.parseDouble(substring2)*Math.pow(0.1,Integer.parseInt(substring4));
        }*/

    }
}
