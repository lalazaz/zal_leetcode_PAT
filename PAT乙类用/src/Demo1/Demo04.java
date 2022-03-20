package Demo1;

import java.util.*;

public class Demo04 {
    //接受输入有问题，如何得到黏贴的三行字符串？

    //1004 成绩排名 (20 分)
    //读入 n（>0）名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
    public static void main(String[] args) {
        //接受学生个数n
        int i = new Scanner(System.in).nextInt();
        //循环使用 字符串数组 接受信息
        String[] info = new String[i];

        //构造key
        String m_key = null;
        //构造value
        int m_value= 0;
        //集合收集信息，其中key为 姓名+" "+学号，value为成绩
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        while (i-- != 0){
            info[i] = new Scanner(System.in).nextLine();

            //数组中每一个字符串进行空格分割，得到姓名、学号、成绩
                //字符串按照空格分割String[] c = result.split("\\s+");
            //temp数组用于接受分割后的字符串
            String[] temp = new String[i];
            temp = info[i].split("\\s+");
            //得到key
            m_key = temp[0]+" "+temp[1];
            //得到value
            int i1 = Integer.parseInt(temp[2]);
            m_value= i1;
            stringIntegerHashMap.put(m_key,m_value);

        }
        //遍历集合得到最小成绩，最大成绩，输出key
        //设置分数
        int MAX = 0;
        int MIN = 100;
        Iterator<Map.Entry<String, Integer>> iterator = stringIntegerHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            //System.out.println(next.getKey()+"\n"+next.getValue());

            if (MAX < next.getValue()){
                MAX = next.getValue();
            }
            if (MIN > next.getValue()){
                MIN = next.getValue();
            }
        }
        //分数对应信息
        String M_MAX = "";
        String M_MIN = "";
        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            if (entry.getValue().equals(MAX)){
                M_MAX = entry.getKey();
            }
            if (entry.getValue().equals(MIN)){
                M_MIN = entry.getKey();
            }
        }
        System.out.println(M_MAX);
        System.out.println(M_MIN);
    }
}
