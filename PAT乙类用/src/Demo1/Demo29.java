package Demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Date 2022/3/4 12:54
 **/

//2022/03/04 14:14:06   答案正确      20	编程题	Java (javac)	85 ms
//1029 旧键盘 (20 分)
//a-z:97-122,A-Z:65-90,0-9:48-57
public class Demo29 {
    public static void main(String[] args) throws IOException {
        //1.集合ArrayList接受两行数据   第一行叫做quan   第二行叫做buquan    字母一律转为大写
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] quan = br.readLine().toUpperCase().toCharArray();
        char[] buquan = br.readLine().toUpperCase().toCharArray();

        Character[] res = new Character[quan.length];
        /*System.out.println(quan);
        System.out.println(buquan);*/
        //2.找到第一个集合中第二个集合没有的字符
        int j = 0;
        int k = 0;
        for (int i = 0; i < quan.length; i++) {
            //遍历quan中每一个字符，在buquan中找对应
            int buquan_length = buquan.length;
            while (buquan_length-- != 0) {
                if (quan[i] == buquan[buquan_length]) {
                    break;
                }
            }
            //System.out.print(buquan_length);
            if (buquan_length == -1) {
                res[k++] = quan[i];
            }
        }
        String a = "";
        for (Object o : res) {
            if (o != null) {
                a += o;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < a.length(); i++) {
            //如果没有重复，出现的字符都等于第一次出现的下标
            if (a.indexOf(a.charAt(i)) == i) {
                sb.append(a.charAt(i));
            }
        }

        System.out.println(sb);
    }
}
