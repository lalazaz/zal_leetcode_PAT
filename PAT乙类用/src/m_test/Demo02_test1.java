package m_test;

public class Demo02_test1 {
    public static void main(String[] args) {
        String[] a = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        int num = 24252532;
        String result = "";
        while (true){
            //s是num的个位数
                int s = num % 10;

                result += a[s]+" ";
                //System.out.print(a[s]+" ");
                num /= 10;
            if (num % 10 ==0)break;
        }
        //str = str.substring(0, str.length() -1);去掉最后一位
        result = result.substring(0, result.length() -1);
        System.out.print(result);
    }
}
