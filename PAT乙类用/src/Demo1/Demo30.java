package Demo1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 牛客老石基
 * @Date 2022/3/4 14:16
 **/
//1030 完美数列 (25 分)
public class Demo30 {
    //输入的时候考虑太杂，输入过程和执行过程可以放在一起
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int maxlen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + maxlen; j < n; j++) {
                if (arr[j] > arr[i] * p)
                    break;
                maxlen++;
            }
        }
        System.out.println(maxlen);
    }
    //关键是找出那几个不寻常的数字
    //普通的数字  接受则可以计入   特殊的数字很大或是很小就直接跳过
}






















/*
    //接受数组ints，和另外一个数字p，返回ints最大数字减去最小数和p的积
    public static int max_min_p(int[] ints,int p){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            if (max < ints[i]) max = ints[i];
            if (min > ints[i]) min = ints[i];
        }
        return max-min*p;
    }



    //给你一串数字和一个数字，返回一个数组，排序方式是距离这个数字的绝对距离
    public static int[] nums_num(int[] ints,int X){
        //本质是冒泡
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i - 1; j++) {
                if (Math.abs(ints[j]-X) > Math.abs(ints[j+1]-X)){
                    int temp = 0;
                    temp = ints[j+1];
                    ints[j+1] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return ints;
    }
    public static void main(String[] args) throws IOException {

        //1.接受第一行的N和p和数组ints1接受第二行的数字
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String[] split = line1.split("\\s+");
        int N = Integer.parseInt(split[0]);
        int p = Integer.parseInt(split[1]);
        String line2 = br.readLine();
        br.close();
        String[] split1 = line2.split("\\s+");
        int[] ints = new int[N];
        int i = 0;
        for (String s : split1) {
            ints[i++] = Integer.parseInt(s);
        }
        *//*一个接受输入就这么多代码..*//*


        int q = 0;
        String temp = "";
        //2.进行靠近p排序
        int[] ints1 = nums_num(ints, p);
        int res = 0;
        for (Integer o : ints1) {
            q++;
            temp += o+" ";
            int[] ints2 = new int[q];
            res = ints2.length;
            String[] split2 = temp.split("\\s+");
            for (int j = 0; j < split2.length; j++) {
                ints2[j] = Integer.parseInt(split2[j]);
                //System.out.println("==="+split2[j]+"==");
            }
            if (max_min_p(ints2,p)>0) break;
            //System.out.println("==================================");
        }
        System.out.println(res-1);
    }*/
